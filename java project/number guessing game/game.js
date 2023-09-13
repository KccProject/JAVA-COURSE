// game.js
const guessInput = document.getElementById('guess');
const checkButton = document.getElementById('check');
const message = document.getElementById('message');
const retryButton = document.getElementById('retry');

let chhupaNumber;
let no_of_prayas = 0;

function initGame() {
    chhupaNumber = Math.floor(Math.random() * 100) + 1;
    no_of_prayas = 0;

    message.textContent = '';
    guessInput.value = '';
    guessInput.disabled = false;
    checkButton.disabled = false;
    retryButton.style.display = 'none';
}

checkButton.addEventListener('click', function () {
    const userGuess = parseInt(guessInput.value);
    no_of_prayas++;

    if (userGuess === chhupaNumber) {
        message.textContent = `Congratulations! You guessed the number ${chhupaNumber} in ${no_of_prayas} attempts.`;
        guessInput.disabled = true;
        checkButton.disabled = true;
        retryButton.style.display = 'block';
    } else if (userGuess < chhupaNumber) {
        message.textContent = 'Try a higher number.';
    } else {
        message.textContent = 'Try a lower number.';
    }
});

retryButton.addEventListener('click', function () {
    initGame();
});

initGame();
