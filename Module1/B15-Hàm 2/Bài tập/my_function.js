function isPrimeNumber(a) {
    let count = 0;

    for(let i = 1; i <= a; i++) {
        if (a % i === 0) {
            count++;
        }
    }

    if (count === 2) {
        return true;
    }

    return false;
}

function isPrimeNumberNoReturn(a) {
    let count = 0;

    for(let i = 1; i <= a; i++) {
        if (a % i === 0) {
            count++;
        }
    }

    if (count === 2) {
        console.log("La so nguyen to");
    } else {
        console.log("Khong phai la so nguyen to");
    }

}

function sum(a, b) {
    return a + b;
}