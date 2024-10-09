<?php

namespace App\Repository;

use App\Entity\Book;
use App\Service\VersioningService;
use Doctrine\Bundle\DoctrineBundle\Repository\ServiceEntityRepository;
use Doctrine\Persistence\ManagerRegistry;
use JMS\Serializer\SerializationContext;
use JMS\Serializer\SerializerInterface;
use Symfony\Component\HttpFoundation\JsonResponse;
use Symfony\Component\HttpFoundation\Response;
use Symfony\Component\Routing\Annotation\Route;

/**
 * @extends ServiceEntityRepository<Book>
 */
class BookRepository extends ServiceEntityRepository
{
    public function __construct(ManagerRegistry $registry)
    {
        parent::__construct($registry, Book::class);
    }

    public function findAllWithPagination($page, $limit)
    {
        $qb = $this->createQueryBuilder('b')
        ->setFirstResult(($page - 1) * $limit)
        ->setMaxResults($limit);
        /** Deuxième Méthode pour le lazy loading
         *  $query = $qb->getQuery();
         *  $query->setFetchMode(Book::class, "author", \Doctrine\ORM\Mapping\ClassMetadata::FETCH_EAGER);
        */
        return $qb->getQuery()->getResult();
    }

    #[Route('/api/books/{id}', name: 'detailBook', methods: ['GET'])]
    public function getDetailBook(Book $book, SerializerInterface $serializer, VersioningService $versioningService): JsonResponse
    {
        $version = $versioningService->getVersion();
        $context =
            SerializationContext::create()->setGroups(["getBooks"]);
        $context->setVersion($version);
        $jsonBook = $serializer->serialize(
            $book,
            'json',
            $context
        );
        return new JsonResponse(
            $jsonBook,
            Response::HTTP_OK,
            [],
            true
        );
    }

    //    /**
    //     * @return Book[] Returns an array of Book objects
    //     */
    //    public function findByExampleField($value): array
    //    {
    //        return $this->createQueryBuilder('b')
    //            ->andWhere('b.exampleField = :val')
    //            ->setParameter('val', $value)
    //            ->orderBy('b.id', 'ASC')
    //            ->setMaxResults(10)
    //            ->getQuery()
    //            ->getResult()
    //        ;
    //    }

    //    public function findOneBySomeField($value): ?Book
    //    {
    //        return $this->createQueryBuilder('b')
    //            ->andWhere('b.exampleField = :val')
    //            ->setParameter('val', $value)
    //            ->getQuery()
    //            ->getOneOrNullResult()
    //        ;
    //    }
}
