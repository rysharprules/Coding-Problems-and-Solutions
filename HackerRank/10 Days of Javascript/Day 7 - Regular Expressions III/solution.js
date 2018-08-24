'use strict';

process.stdin.resume();
process.stdin.setEncoding('utf-8');

let inputString = '';
let currentLine = 0;

process.stdin.on('data', inputStdin => {
    inputString += inputStdin;
});

process.stdin.on('end', _ => {
    inputString = inputString.trim().split('\n').map(string => {
        return string.trim();
    });

    main();
});

function readLine() {
    return inputString[currentLine++];
}

function regexVar() {
    /*
     * Declare a RegExp object variable named 're'
     * It must match ALL occurrences of numbers in a string.
     */
    const regex = /\d+/; // another way to create regex object implicitly. literals are faster than constructors as compiled only once
    const regex2 = /\d+/g; // includes flag:
    /*
        g: global match.
        i: ignore case.
        m: multiline. Treats beginning (^) and end ($) characters as working over multiple lines.
        u: unicode. Treat pattern as a sequence of unicode code points.
        y: sticky. Matches only from the index indicated by the lastIndex property of this regular expression in the target string.
    */
    const re = new RegExp(regex, 'g'); // constructor compiled every time this is called

    /*
     * Do not remove the return statement
     */
    return re;
}

function main() {
    const re = regexVar();
    const s = readLine();

    const r = s.match(re);

    for (const e of r) {
        console.log(e);
    }
}