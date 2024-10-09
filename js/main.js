//variable
let feuRouge = "rouge";
let feuOrange = "orange";
let feuVert = "vert";

//une fonction qui verifie si c'est la bonne couleur
function feuTricolore() {
    if (feuRouge === "rouge") {
        console.log("Arrêtez vous !");
    } else if (feuOrange === "orange") {
        console.log("Préparez vous à vous arrêter !");
    } else if (feuVert === "rouge") {
        console.log("Avancez !");
    } else {
        console.log("mauvaise couleur ou feu en panne");
    };
};

feuTricolore();

///////////////////////////////////////////////////////////////

//boucle for avec un tableau
let array = [];
for (let i = 0; i < 5; i++) {
    array.push("*");
    console.log(array.join(""));
};

//boucle for
let etoile = "";
for (let i = 0; i < 5; i++) {
    etoile = etoile + "*";
    console.log(etoile)
};

///////////////////////////////////////////////////////////////

function exoFizzBuzz() {

    //la boucle qui va de 1 à 15
    for (let index = 1; index < 16; index++) {

        //un IF qui vérifie si le nombre est divisible par 3 et 5 (donc est égal à 0) et renvoie au ELSE IF si ce n'est pas bon
        if (index % 3 === 0 && index % 5 === 0) {
            console.log(index + " " + "FizzBuzz")
        }
        //un ELSE IF qui vérifie si le nombre est divisible par 3 (donc est égal à 0) et renvoie si rien n'est bon au ELSE if
        else if (index % 3 === 0) {
            console.log(index + " " + "Fizz");
        }

        //un ELSE IF qui vérifie si le nombre est divisible par 5 (donc est égal à 0) et renvoie si rien n'est bon au ELSE if
        else if (index % 5 === 0) {
            console.log(index + " " + "Buzz");
        }
        //si aucun chiffre n'est bon le nombre s'affiche
        else {
            console.log(index);
        }
    }
};

exoFizzBuzz();

//////////////////////////////////////////////////////////////////////

function exo1() {
    let name = "Michel";
    console.log("Bonjour " + name + " !");
};
exo1();

//////////////////////////////////////////////////////////////////////

function exo2(nomb1, nomb2) {
    console.log(nomb1 + nomb2);
};
exo2(2, 3);

//////////////////////////////////////////////////////////////////////

function exo3(coutDeFabrication, gain) {
    if (coutDeFabrication < gain) {
        let gainTotal = gain - coutDeFabrication;
        console.log("Le gain total est de " + gainTotal + "€");
    } else {
        let perteTotal = coutDeFabrication - gain;
        console.log("La perte total est de " + perteTotal + "€");
    }
};
exo3(25, 150);

//////////////////////////////////////////////////////////////////////

function exo4(nombre1, nombre2, nombre3) {
    if (nombre2 && nombre3 < nombre1) {
        console.log("Le nombre le plus grand est " + nombre1 + ".");
    } else if (nombre1 && nombre3 < nombre2) {
        console.log("Le nombre le plus grand est " + nombre2 + ".");
    } else if (nombre1 && nombre2 < nombre3) {
        console.log("Le nombre le plus grand est " + nombre3 + ".");
    }
};
exo4(500, 8, 60);

//////////////////////////////////////////////////////////////////////

function exo5(...nombresAleatoires) {
    console.log(Math.max(...nombresAleatoires));
};
exo5(1000, 1, 50, 4, 900);

//////////////////////////////////////////////////////////////////////

function exo6Moyenne(array) {
    let sum = 0;
    for (let i = 0; i < array.length; i++) {
        sum += array[i];
    }
    return sum / array.length;
};
exo6Moyenne([1, 15, 40, 18, 20]);

function exo6(nom, ...array) {
    let result = exo6Moyenne(...array);
    if (result < 0 || result > 20) {
        console.log("Mention Note non valide pour nom" + nom);
    } else if (result < 5) {
        console.log("Mention Catastrophique pour " + nom);
    } else if (result < 11) {
        console.log("Mention Insuffisant pour " + nom);
    } else if (result < 16) {
        console.log("Mention Passable pour " + nom);
    } else if (result < 19) {
        console.log("Mention Bien pour " + nom);
    } else if (result < 21) {
        console.log("Mention Très Bien pour " + nom);
    };
};
exo6("Michel", [20, 20, 2]);

//////////////////////////////////////////////////////////////////////

function exo7(num1, num2, operator) {
    // valeur par défault
    let result = "";
    // On vérifie l'opérateur si c'est un +, -, * ou une /
    switch (operator) {
        case "+":
            result = num1 + num2;
            break;
        case "-":
            result = num1 - num2;
            break;
        case "*":
            result = num1 * num2;
            break;
        case "/":
            if (num2 !== 0) {
                result = num1 / num2;
            } else {
                console.error("COMMENT OSEZ-VOUS DIVISEZ "+ `${num1}` + " PAR " + `${num2}`);
            }
            break;
            // un défault avec un valeur vide sinon js pleure 
        default: "";
    }
    console.log(`Le résultat de ${num1} ${operator} ${num2} est ${result}`);
}

exo7(9, 0, "/");

//////////////////////////////////////////////////////////////////////

function exo8() {
    let etoile = "";
    for (let i = 0; i < 5; i++) {
        etoile = etoile + "*";
        console.log(etoile);
    };

    for (let i = 5 - 1; i >= 1; i--) {
        etoile = etoile.substring(0, i);
        console.log(etoile);
    };
};
exo8();

//////////////////////////////////////////////////////////////////////

function exo9(montant) {


    // L'objet défini la valeur des billets et des pièces en centimes
    const conversion = [
        { name: 'billet de 100', value: 10000 }, // 10 000
        { name: 'billet de 50', value: 5000 }, // 5 000
        { name: 'billet de 20', value: 2000 }, // 2 000
        { name: 'billet de 10', value: 1000 }, // 1000
        { name: 'billet de 5', value: 500 }, // 500
        { name: 'pièce de 2', value: 200 }, // 200
        { name: 'pièce de 1', value: 100 }, // 100
        { name: 'pièce de 0.50', value: 50 }, // 50
        { name: 'pièce de 0.20', value: 20 }, // 20
        { name: 'pièce de 0.10', value: 10 }, // 10
        { name: 'pièce de 0.05', value: 5 }, // 5
        { name: 'pièce de 0.02', value: 2 }, // 2
        { name: 'pièce de 0.01', value: 1 } // 1
    ];

    // Conversion en centimes
    let moneyRestantes = Math.round(montant * 100);
    const result = [];

    // Calculer le nombre de chaque billet et pièce nécessaire
    //J'utilise const pour avoir un default value
    // {} = https://www.w3schools.com/js/js_string_templates.asp
    for (const { name, value } of conversion) {
        if (moneyRestantes >= value) {
            const count = Math.floor(moneyRestantes / value);
            moneyRestantes -= count * value;
            result.push(`${count} ${name}${count > 1 ? 's' : ''}`);
        }
    }

    return result.join(',\n');
}

console.log(exo9(187.43));


//////////////////////////////////////////////////////////////////////

function exo10(...temperatures) {
    // Si aucune température n'est fournie il va afficher un message et retourner
    if (temperatures.length == "") {
        console.log("MET QUEL QUE CHOSE BORDEL.");
        return;
    }

    // Initialisation de la variable `proche` à null pour indiquer qu'aucune température n'a encore été trouvée
    // On ne peut pas mettre "" car c'est un nombre et non un string 
    let proche = null;

    // Boucle à travers chaque température fournie
    for (let temp of temperatures) {
        // Vérifie si la valeur actuelle n'est pas un nombre valide
        // https://developer.mozilla.org/fr/docs/Web/JavaScript/Reference/Global_Objects/isNaN = isNaN
        if (typeof temp !== "number" || isNaN(temp)) {
            // Affiche un message d'erreur si la valeur n'est pas un nombre valide
            console.error(`${temp}` + " n'est pas un mesurable donc retente ta chance (sois c'est pas un nombre ou tu la mis dans un string)");
            return;
        }

        // Si `proche` n'est pas encore défini (null) ou si la valeur actuelle est plus proche de 0
        // ou si les deux valeurs sont à égale distance de 0 mais que la valeur actuelle est positive
        if (proche === null || Math.abs(temp) < Math.abs(proche) || (Math.abs(temp) === Math.abs(proche) && temp > proche)) {
            // Met à jour `proche` avec la valeur actuelle
            proche = temp;
        }
    }

    // Affiche la température la plus proche de 0
    console.log("La température la plus proche de 0 est : " + `${proche}`);
}
exo10(3, -2, 5, 14, 0, 4);
