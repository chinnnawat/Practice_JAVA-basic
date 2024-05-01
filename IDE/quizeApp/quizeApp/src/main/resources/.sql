INSERT INTO question (id, category, difficultylevel, option1, option2, option3, option4, right_answer, question_title)
VALUES
  (1, 'Java', 'Easy', 'class', 'interface', 'extends', 'inheritance', 'extends', 'What keyword in Java is used to define a new class?'),
  (2, 'Java', 'Easy', '4', '5', '6', '7', '6', 'What is the output of 3 + 3 in Java?'),
  (3, 'Java', 'Easy', 'True', 'false', '0', '1', '1', 'What is the result of the expression (1 == 1) in Java?'),
  (4, 'Java', 'Easy', 'try', 'throw', 'catch', 'finally', 'catch', 'Which keyword is used to define a block of code that will be tested for errors in Java?'),
  (5, 'Java', 'Easy', 'It indicates that a variable is constant.', 'It indicates that a method can be accessed without creating an instance of the class.', 'It indicates that the final value of a variable cannot be changed.', 'It indicates that a variable is constant.', 'It indicates that a variable is constant.', 'What does the keyword final indicate in Java?'),
  (6, 'Java', 'Easy', 'constant int x=5', 'final int x = 5', 'static int x-5', 'int x = 5;', 'constant int x=5;', 'What is the correct way to declare a constant integer variable in Java?');



CREATE TABLE questions (
    id INTEGER PRIMARY KEY GENERATED ALWAYS AS IDENTITY,
    questionTitle VARCHAR(255),
    option1 VARCHAR(255),
    option2 VARCHAR(255),
    option3 VARCHAR(255),
    option4 VARCHAR(255),
    rightAnswer VARCHAR(255),
    difficultylevel VARCHAR(255),
    category VARCHAR(255)
);
