package com.example.homework_4;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.input.MouseButton;
import javafx.scene.input.MouseEvent;

import java.util.ArrayList;
import java.util.Objects;

import static java.lang.Math.abs;

public class HelloController {
    @FXML
    private Button field1;
    @FXML
    private Button field2;
    @FXML
    private Button field3;
    @FXML
    private Button field4;
    @FXML
    private Button field5;
    @FXML
    private Button field6;
    @FXML
    private Button field7;
    @FXML
    private Button field8;
    @FXML
    private Button field9;

    Boolean[][] marks = new Boolean[3][3];
    ArrayList<String> moves = new ArrayList<>();
    String winner;
    int countMoves = 0;
    int countMovesX = 0;
    int countMovesY = 0;

    public void onStart(MouseEvent mouseEvent) {
        initGame(field1,field2,field3,field4,field5,field6,field7,field8,field9,marks);
    }

    public void initGame(Button field1, Button field2, Button field3, Button field4, Button field5, Button field6, Button field7, Button field8, Button field9, Boolean[][] marks) {
        field1.setText("");
        field2.setText("");
        field3.setText("");
        field4.setText("");
        field5.setText("");
        field6.setText("");
        field7.setText("");
        field8.setText("");
        field9.setText("");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                marks[i][j] = null;
            }
        }
        moves.clear();
        winner = null;
        countMoves = 0;
        countMovesX = 0;
        countMovesY = 0;
    }

    public void onField1(MouseEvent mouseEvent) {
        try {
            if (marks[0][0] == null) {
                if (mouseEvent.getButton() == MouseButton.PRIMARY) {
                    field1.setText("X");
                    marks[0][0] = true;
                    moves.add("X");
                    ++countMovesX;
                } else {
                    field1.setText("0");
                    marks[0][0] = false;
                    moves.add("0");
                    ++countMovesY;
                }
            }
            ++countMoves;
            checkWinner();
        } catch (Exception ignored) { }
    }

    public void onField2(MouseEvent mouseEvent) {
        try {
            if (marks[0][1] == null) {
                if (mouseEvent.getButton() == MouseButton.PRIMARY) {
                    field2.setText("X");
                    marks[0][1] = true;
                    moves.add("X");
                    ++countMovesX;
                } else {
                    field2.setText("0");
                    marks[0][1] = false;
                    moves.add("0");
                    ++countMovesY;
                }
                ++countMoves;
                checkWinner();
            }

        } catch (Exception ignored) { }
    }
    public void onField3(MouseEvent mouseEvent) {
        try {
            if (marks[0][2] == null) {
                if (mouseEvent.getButton() == MouseButton.PRIMARY) {
                    field3.setText("X");
                    marks[0][2] = true;
                    moves.add("X");
                    ++countMovesX;
                } else {
                    field3.setText("0");
                    marks[0][2] = false;
                    moves.add("0");
                    ++countMovesY;
                }
                ++countMoves;
                checkWinner();
            }

        } catch (Exception ignored) { }
    }

    public void onField4(MouseEvent mouseEvent) {
        try {
            if (marks[1][0] == null) {
                if (mouseEvent.getButton() == MouseButton.PRIMARY) {
                    field4.setText("X");
                    marks[1][0] = true;
                    moves.add("X");
                    ++countMovesX;
                } else {
                    field4.setText("0");
                    marks[1][0] = false;
                    moves.add("0");
                    ++countMovesY;
                }
                ++countMoves;
                checkWinner();
            }
        } catch (Exception ignored) { }
    }

    public void onField5(MouseEvent mouseEvent) {
        try {
            if (marks[1][1] == null) {
                if (mouseEvent.getButton() == MouseButton.PRIMARY) {
                    field5.setText("X");
                    marks[1][1] = true;
                    moves.add("X");
                    ++countMovesX;
                } else {
                    field5.setText("0");
                    marks[1][1] = false;
                    moves.add("0");
                    ++countMovesY;
                }
                ++countMoves;
                checkWinner();
            }
        } catch (Exception ignored) { }
    }
    public void onField6(MouseEvent mouseEvent) {
        try {
            if (marks[1][2] == null) {
                if (mouseEvent.getButton() == MouseButton.PRIMARY) {
                    field6.setText("X");
                    marks[1][2] = true;
                    moves.add("X");
                    ++countMovesX;
                } else {
                    field6.setText("0");
                    marks[1][2] = false;
                    moves.add("0");
                    ++countMovesY;
                }
                ++countMoves;
                checkWinner();
            }
        } catch (Exception ignored) {

        }
    }
    public void onField7(MouseEvent mouseEvent) {
        try {
            if (marks[2][0] == null) {
                if (mouseEvent.getButton() == MouseButton.PRIMARY) {
                    field7.setText("X");
                    marks[2][0] = true;
                    moves.add("X");
                    ++countMovesX;
                } else {
                    field7.setText("0");
                    marks[2][0] = false;
                    moves.add("0");
                    ++countMovesY;
                }
                ++countMoves;
                checkWinner();
            }
        } catch (Exception ignored) { }
    }
    public void onField8(MouseEvent mouseEvent) {
        try {
            if (marks[2][1] == null) {
                if (mouseEvent.getButton() == MouseButton.PRIMARY) {
                    field8.setText("X");
                    marks[2][1] = true;
                    moves.add("X");
                    ++countMovesX;
                } else {
                    field8.setText("0");
                    marks[2][1] = false;
                    moves.add("0");
                    ++countMovesY;
                }
                ++countMoves;
                checkWinner();
            }
        } catch (Exception ignored) { }
    }
    public void onField9(MouseEvent mouseEvent) {
        try {
            if (marks[2][2] == null) {
                if (mouseEvent.getButton() == MouseButton.PRIMARY) {
                    field9.setText("X");
                    marks[2][2] = true;
                    moves.add("X");
                    ++countMovesX;
                } else {
                    field9.setText("0");
                    marks[2][2] = false;
                    moves.add("0");
                    ++countMovesY;
                }
                ++countMoves;
                checkWinner();
            }
        } catch (Exception ignored) { }
    }


    public void checkWinner() {
        boolean result = false;
        //проверка одинаковых символов на 1 строке
        if (marks[0][0] != null && marks[0][0] == marks[0][1] && marks[0][1] == marks[0][2]) {
            result = true;
            winner = marks[0][0].toString();
        }
        //проверка одинаковых символов на 2 строке
        if (marks[1][0] != null && marks[1][0] == marks[1][1] && marks[1][1] == marks[1][2]) {
            result = true;
            winner = marks[1][0].toString();
        }
        //проверка одинаковых символов на 3 строке
        if (marks[2][0] != null && marks[2][0] == marks[2][1] && marks[2][1] == marks[2][2]) {
            result = true;
            winner = marks[2][0].toString();
        }
        //проверка одинаковых символов на 1 столбце
        if (marks[0][0] != null && marks[0][0] == marks[1][0] && marks[1][0] == marks[2][0]) {
            result = true;
            winner = marks[0][0].toString();
        }
        //проверка одинаковых символов на 2 столбце
        if (marks[0][1] != null && marks[0][1] == marks[1][1] && marks[1][1] == marks[2][1]) {
            result = true;
            winner = marks[0][1].toString();
        }
        //проверка одинаковых символов на 3 столбце
        if (marks[0][2] != null && marks[0][2] == marks[1][2] && marks[1][2] == marks[2][2]) {
            result = true;
            winner = marks[0][2].toString();
        }
        //проверка одинаковых символов на правой диагонали
        if (marks[0][0] != null && marks[0][0] == marks[1][1] && marks[1][1] == marks[2][2]) {
            result = true;
            winner = marks[0][0].toString();
        }
        //проверка одинаковых символов на левой диагонали
        if (marks[0][2] != null && marks[0][2] == marks[1][1] && marks[1][1] == marks[2][0]) {
            result = true;
            winner = marks[0][2].toString();
        }


        if (result && (abs(countMovesX - countMovesY) <= 1)) {
            if (Objects.equals(winner, "true")) {
                if (Objects.equals(moves.get(0), "X")) {
                    showAlert("Победил игрок, который ходил " + "X." + " Первый ходил " + moves.get(0));
                } else {
                    showAlert("Победил игрок, который ходил " + "X. Была ошибка." + " Первый ходил " + moves.get(0));
                }

            } else {
                if (Objects.equals(moves.get(0), "0")){
                    showAlert("Победил игрок, который ходил " + "0." + " Первый ходил " + moves.get(0));
                } else {
                    showAlert("Победил игрок, который ходил " + "0. Была ошибка." + " Первый ходил " + moves.get(0));
                }
            }
        }
        if (result && (abs(countMovesX - countMovesY) > 1)) {
            if (Objects.equals(winner, "false")) {
                showAlert("Победил игрок, который ходил " + "0. Была ошибка. Первый ходил " + moves.get(0));
            } else {
                showAlert("Победил игрок, который ходил " + "X. Была ошибка. Первый ходил " + moves.get(0));
            }
        }
        if (!result && countMoves == 9) {
            showAlert("Победила дружба! Первый ходил " + moves.get(0));
        }
    }


    private void showAlert(String message) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Результат игры");
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.show();
    }
}
