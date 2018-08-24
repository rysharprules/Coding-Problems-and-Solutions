class Rotator {
    constructor(values) {
        this.values = values
    }

    rotation() {
        this.values.unshift(this.values.pop())
    }

    round() {
        this.rotation()
        this.render()
    }

    render() {
        let [btn1, btn2, btn3, btn6, btn9, btn8, btn7, btn4] = this.values
        let hashTable = {btn1, btn2, btn3, btn6, btn9, btn8, btn7, btn4 }
        for (let key in hashTable) {
            document.getElementById(key).innerHTML = hashTable[key]
        }
    }
}

document.addEventListener("DOMContentLoaded", () => {
    let rotator = new Rotator([1, 2, 3, 6, 9, 8, 7, 4])
    rotator.render()

   document.getElementById("btn5").addEventListener("click", () => {
        rotator.round()
    })
})