//aus https://developer.mozilla.org/de/docs/Web/JavaScript/Data_structures

//Die Variablen haben keine festgelegten Typen, und werden einfach so mit neuen Datentypen geändert
let foo = 42; // foo is now a number
foo = "bar"; // foo is now a string
foo = true; // foo is now a boolean

let a = 42; // a is a number
const result = a + "1"; // JavaScript coerces foo to a string, so it can be concatenated with the other operand
console.log(result); // 421

//unklare "-this" von ChatGPT

const obj = {
    name: "Test",
    getName: function () {
        console.log(this.name);
    }
};
const getName = obj.getName;
getName(); // Undefined oder Fehler, weil `this` nicht mehr auf `obj` zeigt.
//Es zeigt auf ein globales Objekt

//parseint interpretiert Zahlen wie "09" als 0 //ChatGPT
console.log(parseInt("08")); // 8 in modernen Browsern, aber in alten `0`
console.log(parseInt("09")); // 9 in modernen Browsern, aber `0` in alten
//Weil die 0 vor der Zahl steht. Um Problem zu lösen, muss die Stelle angegeben werden