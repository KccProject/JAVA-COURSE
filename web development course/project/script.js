document.addEventListener('DOMContentLoaded', function() {
  var addButton = document.getElementById('addButton');
  var container = document.getElementById('container');

  addButton.addEventListener('click', function() {
    var divContainer = document.createElement('div');
    divContainer.classList.add('container');

    var subTopicDiv = document.createElement('div');
    var subTopicLabel = document.createElement('label');
    subTopicLabel.setAttribute('for', 'dropdown');
    subTopicLabel.textContent = 'Sub Topic*';
    var subTopicDropdown = createDropdown('dropdown');

    subTopicDiv.appendChild(subTopicLabel);
    subTopicDiv.appendChild(subTopicDropdown);

    var topicDiv = document.createElement('div');
    var topicLabel = document.createElement('label');
    topicLabel.setAttribute('for', 'input1');
    topicLabel.textContent = 'Topic';
    var topicInput = document.createElement('input');
    topicInput.type = 'text';
    topicInput.id = 'input1';
    topicInput.name = 'input1';
    topicInput.placeholder = 'Enter text';

    topicDiv.appendChild(topicLabel);
    topicDiv.appendChild(topicInput);

    var subjectDiv = document.createElement('div');
    var subjectLabel = document.createElement('label');
    subjectLabel.setAttribute('for', 'input2');
    subjectLabel.textContent = 'Subject';
    var subjectInput = document.createElement('input');
    subjectInput.type = 'text';
    subjectInput.id = 'input2';
    subjectInput.name = 'input2';
    subjectInput.placeholder = 'Enter text';

    subjectDiv.appendChild(subjectLabel);
    subjectDiv.appendChild(subjectInput);

    var deleteButton = document.createElement('button');
    deleteButton.innerText = 'Delete';
    deleteButton.addEventListener('click', function() {
      divContainer.remove();
    });

    divContainer.appendChild(subTopicDiv);
    divContainer.appendChild(topicDiv);
    divContainer.appendChild(subjectDiv);
    divContainer.appendChild(deleteButton);

    container.appendChild(divContainer);
  });

  function createDropdown(name) {
    var dropdown = document.createElement('select');
    dropdown.name = name;

    var option1 = document.createElement('option');
    option1.value = 'option1';
    option1.textContent = 'Option 1';
    dropdown.appendChild(option1);

    var option2 = document.createElement('option');
    option2.value = 'option2';
    option2.textContent = 'Option 2';
    dropdown.appendChild(option2);

    var option3 = document.createElement('option');
    option3.value = 'option3';
    option3.textContent = 'Option 3';
    dropdown.appendChild(option3);

    return dropdown;
  }
});

function openCity(evt, cityName) {
  var i, x, tablinks;
  x = document.getElementsByClassName("city");
  for (i = 0; i < x.length; i++) {
    x[i].style.display = "none";
  }
  tablinks = document.getElementsByClassName("tablink");
  for (i = 0; i < x.length; i++) {
    tablinks[i].className = tablinks[i].className.replace(" w3-blue", "");
  }
  document.getElementById(cityName).style.display = "block";
  evt.currentTarget.className += " w3-blue";
}

//

function handleCheckboxChange() {
  var textEditorCheckbox = document.getElementById("textEditorCheckbox");
  var codeEditorCheckbox = document.getElementById("codeEditorCheckbox");
  var textEditor = document.getElementById("textEditor");
  var codeEditor = document.getElementById("codeEditor");

  if (textEditorCheckbox.checked) {
    textEditor.style.display = "block";
  } else {
    textEditor.style.display = "none";
  }

  if (codeEditorCheckbox.checked) {
    codeEditor.style.display = "block";
  } else {
    codeEditor.style.display = "none";
  }
}    

//

function toggleEditor(editor) {
  var textEditor = document.getElementById('textEditor');
  var codeEditor = document.getElementById('codeEditor');

  var textEditorCheckbox = document.getElementById('textEditorCheckbox');
  var codeEditorCheckbox = document.getElementById('codeEditorCheckbox');

  if (editor === 'textEditor') {
    textEditor.style.display = textEditorCheckbox.checked ? 'block' : 'none';
  } else if (editor === 'codeEditor') {
    codeEditor.style.display = codeEditorCheckbox.checked ? 'block' : 'none';
  }
}

function formatText(command) {
  document.execCommand(command, false, null);
}

function insertLink() {
  var url = prompt("Enter a URL:");
  document.execCommand("createLink", false, url);
}

function insertImage() {
  var url = prompt("Enter an image URL:");
  document.execCommand("insertImage", false, url);
}

// 
function addSolutionOrTestcase() {
  var container = document.getElementById("solutionTestcaseContainer");
  
  // Create a new block div
  var blockDiv = document.createElement("div");
  blockDiv.classList.add("block");
  
  // Create an inline checkboxes div
  var checkboxDiv = document.createElement("div");
  
  // Create three inline checkboxes
  var checkbox1 = document.createElement("input");
  checkbox1.type = "checkbox";
  checkbox1.classList.add("inline-checkbox");
  checkbox1.addEventListener("change", showTextInputBlockAndDropdown);
  
  var checkbox2 = document.createElement("input");
  checkbox2.type = "checkbox";
  checkbox2.classList.add("inline-checkbox");
  checkbox2.addEventListener("change", showTextInputBlockAndDropdown);
  
  var checkbox3 = document.createElement("input");
  checkbox3.type = "checkbox";
  checkbox3.classList.add("inline-checkbox");
  checkbox3.addEventListener("change", showTextInputBlockAndDropdown);
  
  // Append checkboxes to the checkbox div
  checkboxDiv.appendChild(checkbox1);
  checkboxDiv.appendChild(checkbox2);
  checkboxDiv.appendChild(checkbox3);
  
  // Append the checkbox div to the block div
  blockDiv.appendChild(checkboxDiv);
  
  // Create a text input block
  var textInputBlock = document.createElement("div");
  textInputBlock.classList.add("text-input-block");
  
  var textInput = document.createElement("input");
  textInput.type = "text";
  textInput.placeholder = "Enter text";
  
  // Append text input to the text input block
  textInputBlock.appendChild(textInput);
  
  // Create a dropdown box
  var dropdown = document.createElement("select");
  dropdown.classList.add("dropdown");
  
  var option1 = document.createElement("option");
  option1.value = "option1";
  option1.text = "Option 1";
  
  var option2 = document.createElement("option");
  option2.value = "option2";
  option2.text = "Option 2";
  
  var option3 = document.createElement("option");
  option3.value = "option3";
  option3.text = "Option 3";
  
  // Append options to the dropdown box
  dropdown.appendChild(option1);
  dropdown.appendChild(option2);
  dropdown.appendChild(option3);
  
  // Append the text input block and dropdown to the block div
  blockDiv.appendChild(textInputBlock);
  blockDiv.appendChild(dropdown);
  
  // Append the block div to the container
  container.appendChild(blockDiv);
}

function showTextInputBlockAndDropdown() {
  var parentBlock = this.parentNode.parentNode;
  var textInputBlock = parentBlock.querySelector(".text-input-block");
  var dropdown = parentBlock.querySelector(".dropdown");
  
  if (this.checked) {
    textInputBlock.style.display = "block";
    dropdown.style.display = "block";
  } else {
    textInputBlock.style.display = "none";
    dropdown.style.display = "none";
  }
}