import java.awt.*;
import java.awt.event.KeyEvent;

public class Keyboard {
    static final int delay = 10;
    static final int SHIFT_delay = 1;
    protected void buttonSwitcher(String button) {
        try {
            Robot robot = new Robot();
            switch (button) {
                case "А":
                    robot.keyPress(KeyEvent.VK_SHIFT);
                    robot.keyPress(KeyEvent.VK_F);
                    robot.delay(delay);
                    robot.keyRelease(KeyEvent.VK_F);
                    robot.keyRelease(KeyEvent.VK_SHIFT);
                    break;
                case "Б":
                    robot.keyPress(KeyEvent.VK_SHIFT);
                    robot.keyPress(KeyEvent.VK_COMMA);
                    robot.delay(delay);
                    robot.keyRelease(KeyEvent.VK_COMMA);
                    robot.keyRelease(KeyEvent.VK_SHIFT);
                    break;
                case "В":
                    robot.keyPress(KeyEvent.VK_SHIFT);
                    robot.keyPress(KeyEvent.VK_D);
                    robot.delay(delay);
                    robot.keyRelease(KeyEvent.VK_D);
                    robot.keyRelease(KeyEvent.VK_SHIFT);
                    break;
                case "Г":
                    robot.keyPress(KeyEvent.VK_SHIFT);
                    robot.keyPress(KeyEvent.VK_U);
                    robot.delay(delay);
                    robot.keyRelease(KeyEvent.VK_U);
                    robot.keyRelease(KeyEvent.VK_SHIFT);
                    break;
                case "Д":
                    robot.keyPress(KeyEvent.VK_SHIFT);
                    robot.keyPress(KeyEvent.VK_L);
                    robot.delay(delay);
                    robot.keyRelease(KeyEvent.VK_L);
                    robot.keyRelease(KeyEvent.VK_SHIFT);
                    break;
                case "Е":
                    robot.keyPress(KeyEvent.VK_SHIFT);
                    robot.keyPress(KeyEvent.VK_T);
                    robot.delay(delay);
                    robot.keyRelease(KeyEvent.VK_T);
                    robot.keyRelease(KeyEvent.VK_SHIFT);
                    break;
                case "Ё":
                    robot.keyPress(KeyEvent.VK_SHIFT);
                    robot.keyPress(KeyEvent.VK_BACK_QUOTE);
                    robot.delay(delay);
                    robot.keyRelease(KeyEvent.VK_BACK_QUOTE);
                    robot.keyRelease(KeyEvent.VK_SHIFT);
                    break;
                case "Ж":
                    robot.keyPress(KeyEvent.VK_SHIFT);
                    robot.keyPress(KeyEvent.VK_SEMICOLON);
                    robot.delay(delay);
                    robot.keyRelease(KeyEvent.VK_SEMICOLON);
                    robot.keyRelease(KeyEvent.VK_SHIFT);
                    break;
                case "З":
                    robot.keyPress(KeyEvent.VK_SHIFT);
                    robot.keyPress(KeyEvent.VK_P);
                    robot.delay(delay);
                    robot.keyRelease(KeyEvent.VK_P);
                    robot.keyRelease(KeyEvent.VK_SHIFT);
                    break;
                case "И":
                    robot.keyPress(KeyEvent.VK_SHIFT);
                    robot.keyPress(KeyEvent.VK_B);
                    robot.delay(delay);
                    robot.keyRelease(KeyEvent.VK_B);
                    robot.keyRelease(KeyEvent.VK_SHIFT);
                    break;
                case "Й":
                    robot.keyPress(KeyEvent.VK_SHIFT);
                    robot.keyPress(KeyEvent.VK_Q);
                    robot.delay(delay);
                    robot.keyRelease(KeyEvent.VK_Q);
                    robot.keyRelease(KeyEvent.VK_SHIFT);
                    break;
                case "К":
                    robot.keyPress(KeyEvent.VK_SHIFT);
                    robot.keyPress(KeyEvent.VK_R);
                    robot.delay(delay);
                    robot.keyRelease(KeyEvent.VK_R);
                    robot.keyRelease(KeyEvent.VK_SHIFT);
                    break;
                case "Л":
                    robot.keyPress(KeyEvent.VK_SHIFT);
                    robot.keyPress(KeyEvent.VK_K);
                    robot.delay(delay);
                    robot.keyRelease(KeyEvent.VK_K);
                    robot.keyRelease(KeyEvent.VK_SHIFT);
                    break;
                case "М":
                    robot.keyPress(KeyEvent.VK_SHIFT);
                    robot.keyPress(KeyEvent.VK_V);
                    robot.delay(delay);
                    robot.keyRelease(KeyEvent.VK_V);
                    robot.keyRelease(KeyEvent.VK_SHIFT);
                    break;
                case "Н":
                    robot.keyPress(KeyEvent.VK_SHIFT);
                    robot.keyPress(KeyEvent.VK_Y);
                    robot.delay(delay);
                    robot.keyRelease(KeyEvent.VK_Y);
                    robot.keyRelease(KeyEvent.VK_SHIFT);
                    break;
                case "О":
                    robot.keyPress(KeyEvent.VK_SHIFT);
                    robot.keyPress(KeyEvent.VK_J);
                    robot.delay(delay);
                    robot.keyRelease(KeyEvent.VK_J);
                    robot.keyRelease(KeyEvent.VK_SHIFT);
                    break;
                case "П":
                    robot.keyPress(KeyEvent.VK_SHIFT);
                    robot.keyPress(KeyEvent.VK_G);
                    robot.delay(delay);
                    robot.keyRelease(KeyEvent.VK_G);
                    robot.keyRelease(KeyEvent.VK_SHIFT);
                    break;
                case "Р":
                    robot.keyPress(KeyEvent.VK_SHIFT);
                    robot.keyPress(KeyEvent.VK_H);
                    robot.delay(delay);
                    robot.keyRelease(KeyEvent.VK_H);
                    robot.keyRelease(KeyEvent.VK_SHIFT);
                    break;
                case "С":
                    robot.keyPress(KeyEvent.VK_SHIFT);
                    robot.keyPress(KeyEvent.VK_C);
                    robot.delay(delay);
                    robot.keyRelease(KeyEvent.VK_C);
                    robot.keyRelease(KeyEvent.VK_SHIFT);
                    break;
                case "Т":
                    robot.keyPress(KeyEvent.VK_SHIFT);
                    robot.keyPress(KeyEvent.VK_N);
                    robot.delay(delay);
                    robot.keyRelease(KeyEvent.VK_N);
                    robot.keyRelease(KeyEvent.VK_SHIFT);
                    break;
                case "У":
                    robot.keyPress(KeyEvent.VK_SHIFT);
                    robot.keyPress(KeyEvent.VK_E);
                    robot.delay(delay);
                    robot.keyRelease(KeyEvent.VK_E);
                    robot.keyRelease(KeyEvent.VK_SHIFT);
                    break;
                case "Ф":
                    robot.keyPress(KeyEvent.VK_SHIFT);
                    robot.keyPress(KeyEvent.VK_A);
                    robot.delay(delay);
                    robot.keyRelease(KeyEvent.VK_A);
                    robot.keyRelease(KeyEvent.VK_SHIFT);
                    break;
                case "Х":
                    robot.keyPress(KeyEvent.VK_SHIFT);
                    robot.keyPress(KeyEvent.VK_OPEN_BRACKET);
                    robot.delay(delay);
                    robot.keyRelease(KeyEvent.VK_OPEN_BRACKET);
                    robot.keyRelease(KeyEvent.VK_SHIFT);
                    break;
                case "Ц":
                    robot.keyPress(KeyEvent.VK_SHIFT);
                    robot.keyPress(KeyEvent.VK_W);
                    robot.delay(delay);
                    robot.keyRelease(KeyEvent.VK_W);
                    robot.keyRelease(KeyEvent.VK_SHIFT);
                    break;
                case "Ч":
                    robot.keyPress(KeyEvent.VK_SHIFT);
                    robot.keyPress(KeyEvent.VK_X);
                    robot.delay(delay);
                    robot.keyRelease(KeyEvent.VK_X);
                    robot.keyRelease(KeyEvent.VK_SHIFT);
                    break;
                case "Ш":
                    robot.keyPress(KeyEvent.VK_SHIFT);
                    robot.keyPress(KeyEvent.VK_I);
                    robot.delay(delay);
                    robot.keyRelease(KeyEvent.VK_I);
                    robot.keyRelease(KeyEvent.VK_SHIFT);
                    break;
                case "Щ":
                    robot.keyPress(KeyEvent.VK_SHIFT);
                    robot.keyPress(KeyEvent.VK_O);
                    robot.delay(delay);
                    robot.keyRelease(KeyEvent.VK_O);
                    robot.keyRelease(KeyEvent.VK_SHIFT);
                    break;
                case "ъ":
                    robot.keyPress(KeyEvent.VK_SHIFT);
                    robot.keyPress(KeyEvent.VK_CLOSE_BRACKET);
                    robot.delay(delay);
                    robot.keyRelease(KeyEvent.VK_CLOSE_BRACKET);
                    robot.keyRelease(KeyEvent.VK_SHIFT);
                    break;
                case "ы":
                    robot.keyPress(KeyEvent.VK_SHIFT);
                    robot.keyPress(KeyEvent.VK_S);
                    robot.delay(delay);
                    robot.keyRelease(KeyEvent.VK_S);
                    robot.keyRelease(KeyEvent.VK_SHIFT);
                    break;
                case "ь":
                    robot.keyPress(KeyEvent.VK_SHIFT);
                    robot.keyPress(KeyEvent.VK_M);
                    robot.delay(delay);
                    robot.keyRelease(KeyEvent.VK_M);
                    robot.keyRelease(KeyEvent.VK_SHIFT);
                    break;
                case "Э":
                    robot.keyPress(KeyEvent.VK_SHIFT);
                    robot.keyPress(KeyEvent.VK_QUOTE);
                    robot.delay(delay);
                    robot.keyRelease(KeyEvent.VK_QUOTE);
                    robot.keyRelease(KeyEvent.VK_SHIFT);
                    break;
                case "Ю":
                    robot.keyPress(KeyEvent.VK_SHIFT);
                    robot.keyPress(KeyEvent.VK_PERIOD);
                    robot.delay(delay);
                    robot.keyRelease(KeyEvent.VK_PERIOD);
                    robot.keyRelease(KeyEvent.VK_SHIFT);
                    break;
                case "Я":
                    robot.keyPress(KeyEvent.VK_SHIFT);
                    robot.keyPress(KeyEvent.VK_Z);
                    robot.delay(delay);
                    robot.keyRelease(KeyEvent.VK_Z);
                    robot.keyRelease(KeyEvent.VK_SHIFT);
                    break;

                //Small Symbols


                case "а":
                    robot.keyPress(KeyEvent.VK_F);
                    robot.delay(delay);
                    robot.keyRelease(KeyEvent.VK_F);
                    break;
                case "б":
                    robot.keyPress(KeyEvent.VK_COMMA);
                    robot.delay(delay);
                    robot.keyRelease(KeyEvent.VK_COMMA);
                    break;
                case "в":
                    robot.keyPress(KeyEvent.VK_D);
                    robot.delay(delay);
                    robot.keyRelease(KeyEvent.VK_D);
                    break;
                case "г":
                    robot.keyPress(KeyEvent.VK_U);
                    robot.delay(delay);
                    robot.keyRelease(KeyEvent.VK_U);
                    break;
                case "д":
                    robot.keyPress(KeyEvent.VK_L);
                    robot.delay(delay);
                    robot.keyRelease(KeyEvent.VK_L);
                    break;
                case "е":
                    robot.keyPress(KeyEvent.VK_T);
                    robot.delay(delay);
                    robot.keyRelease(KeyEvent.VK_T);
                    break;
                case "ё":
                    robot.keyPress(KeyEvent.VK_BACK_QUOTE);
                    robot.delay(delay);
                    robot.keyRelease(KeyEvent.VK_BACK_QUOTE);
                    break;
                case "ж":
                    robot.keyPress(KeyEvent.VK_SEMICOLON);
                    robot.delay(delay);
                    robot.keyRelease(KeyEvent.VK_SEMICOLON);
                    break;
                case "з":
                    robot.keyPress(KeyEvent.VK_P);
                    robot.delay(delay);
                    robot.keyRelease(KeyEvent.VK_P);
                    break;
                case "и":
                    robot.keyPress(KeyEvent.VK_B);
                    robot.delay(delay);
                    robot.keyRelease(KeyEvent.VK_B);
                    break;
                case "й":
                    robot.keyPress(KeyEvent.VK_Q);
                    robot.delay(delay);
                    robot.keyRelease(KeyEvent.VK_Q);
                    break;
                case "к":
                    robot.keyPress(KeyEvent.VK_R);
                    robot.delay(delay);
                    robot.keyRelease(KeyEvent.VK_R);
                    break;
                case "л":
                    robot.keyPress(KeyEvent.VK_K);
                    robot.delay(delay);
                    robot.keyRelease(KeyEvent.VK_K);
                    break;
                case "м":
                    robot.keyPress(KeyEvent.VK_V);
                    robot.delay(delay);
                    robot.keyRelease(KeyEvent.VK_V);
                    break;
                case "н":
                    robot.keyPress(KeyEvent.VK_Y);
                    robot.delay(delay);
                    robot.keyRelease(KeyEvent.VK_Y);
                    break;
                case "о":
                    robot.keyPress(KeyEvent.VK_J);
                    robot.delay(delay);
                    robot.keyRelease(KeyEvent.VK_J);
                    break;
                case "п":
                    robot.keyPress(KeyEvent.VK_G);
                    robot.delay(delay);
                    robot.keyRelease(KeyEvent.VK_G);
                    break;
                case "р":
                    robot.keyPress(KeyEvent.VK_H);
                    robot.delay(delay);
                    robot.keyRelease(KeyEvent.VK_H);
                    break;
                case "с":
                    robot.keyPress(KeyEvent.VK_C);
                    robot.delay(delay);
                    robot.keyRelease(KeyEvent.VK_C);
                    break;
                case "т":
                    robot.keyPress(KeyEvent.VK_N);
                    robot.delay(delay);
                    robot.keyRelease(KeyEvent.VK_N);
                    break;
                case "у":
                    robot.keyPress(KeyEvent.VK_E);
                    robot.delay(delay);
                    robot.keyRelease(KeyEvent.VK_E);
                    break;
                case "ф":
                    robot.keyPress(KeyEvent.VK_A);
                    robot.delay(delay);
                    robot.keyRelease(KeyEvent.VK_A);
                    break;
                case "х":
                    robot.keyPress(KeyEvent.VK_OPEN_BRACKET);
                    robot.delay(delay);
                    robot.keyRelease(KeyEvent.VK_OPEN_BRACKET);
                    break;
                case "ц":
                    robot.keyPress(KeyEvent.VK_W);
                    robot.delay(delay);
                    robot.keyRelease(KeyEvent.VK_W);
                    break;
                case "ч":
                    robot.keyPress(KeyEvent.VK_X);
                    robot.delay(delay);
                    robot.keyRelease(KeyEvent.VK_X);
                    break;
                case "ш":
                    robot.keyPress(KeyEvent.VK_I);
                    robot.delay(delay);
                    robot.keyRelease(KeyEvent.VK_I);
                    break;
                case "щ":
                    robot.keyPress(KeyEvent.VK_O);
                    robot.delay(delay);
                    robot.keyRelease(KeyEvent.VK_O);
                    break;
                case "э":
                    robot.keyPress(KeyEvent.VK_QUOTE);
                    robot.delay(delay);
                    robot.keyRelease(KeyEvent.VK_QUOTE);
                    break;
                case "ю":
                    robot.keyPress(KeyEvent.VK_PERIOD);
                    robot.delay(delay);
                    robot.keyRelease(KeyEvent.VK_PERIOD);
                    break;
                case "я":
                    robot.keyPress(KeyEvent.VK_Z);
                    robot.delay(delay);
                    robot.keyRelease(KeyEvent.VK_Z);
                    break;

                //Other
                case "":
                    robot.keyPress(KeyEvent.VK_SPACE);
                    robot.delay(delay);
                    robot.keyRelease(KeyEvent.VK_SPACE);
                    break;
                case ",":
                    robot.keyPress(KeyEvent.VK_COMMA);
                    robot.delay(delay);
                    robot.keyRelease(KeyEvent.VK_COMMA);
                    break;
                case "-":
                    robot.keyPress(KeyEvent.VK_MINUS);
                    robot.delay(delay);
                    robot.keyRelease(KeyEvent.VK_MINUS);
                    break;
                case ".":
                    robot.keyPress(KeyEvent.VK_PERIOD);
                    robot.delay(delay);
                    robot.keyRelease(KeyEvent.VK_PERIOD);
                    break;
                case "'":
                    robot.keyPress(KeyEvent.VK_QUOTE);
                    robot.delay(delay);
                    robot.keyRelease(KeyEvent.VK_QUOTE);
                    break;
                case "(":
                    robot.keyPress(KeyEvent.VK_SHIFT);
                    robot.delay(SHIFT_delay);
                    robot.keyPress(KeyEvent.VK_9);
                    robot.delay(delay);
                    robot.keyRelease(KeyEvent.VK_9);
                    robot.delay(SHIFT_delay);
                    robot.keyRelease(KeyEvent.VK_SHIFT);
                    break;
                case ")":
                    robot.keyPress(KeyEvent.VK_SHIFT);
                    robot.delay(SHIFT_delay);
                    robot.keyPress(KeyEvent.VK_0);
                    robot.delay(delay);
                    robot.keyRelease(KeyEvent.VK_0);
                    robot.delay(SHIFT_delay);
                    robot.keyRelease(KeyEvent.VK_SHIFT);
                    break;
                case "\"":
                    robot.keyPress(KeyEvent.VK_SHIFT);
                    robot.delay(SHIFT_delay);
                    robot.keyPress(KeyEvent.VK_QUOTE);
                    robot.delay(SHIFT_delay);
                    robot.keyRelease(KeyEvent.VK_QUOTE);
                    robot.delay(SHIFT_delay);
                    robot.keyRelease(KeyEvent.VK_SHIFT);
                    break;

                //Numbers
                case "0":
                    robot.keyPress(KeyEvent.VK_0);
                    robot.delay(delay);
                    robot.keyRelease(KeyEvent.VK_0);
                    break;
                case "1":
                    robot.keyPress(KeyEvent.VK_1);
                    robot.delay(delay);
                    robot.keyRelease(KeyEvent.VK_1);
                    break;
                case "2":
                    robot.keyPress(KeyEvent.VK_2);
                    robot.delay(delay);
                    robot.keyRelease(KeyEvent.VK_2);
                    break;
                case "3":
                    robot.keyPress(KeyEvent.VK_3);
                    robot.delay(delay);
                    robot.keyRelease(KeyEvent.VK_3);
                    break;
                case "4":
                    robot.keyPress(KeyEvent.VK_4);
                    robot.delay(delay);
                    robot.keyRelease(KeyEvent.VK_4);
                    break;
                case "5":
                    robot.keyPress(KeyEvent.VK_5);
                    robot.delay(delay);
                    robot.keyRelease(KeyEvent.VK_5);
                    break;
                case "6":
                    robot.keyPress(KeyEvent.VK_6);
                    robot.delay(delay);
                    robot.keyRelease(KeyEvent.VK_6);
                    break;
                case "7":
                    robot.keyPress(KeyEvent.VK_7);
                    robot.delay(delay);
                    robot.keyRelease(KeyEvent.VK_7);
                    break;
                case "8":
                    robot.keyPress(KeyEvent.VK_8);
                    robot.delay(delay);
                    robot.keyRelease(KeyEvent.VK_8);
                    break;
                case "9":
                    robot.keyPress(KeyEvent.VK_9);
                    robot.delay(delay);
                    robot.keyRelease(KeyEvent.VK_9);
                    break;

                //ENGLISH

                case "A":
                    robot.keyPress(KeyEvent.VK_SHIFT);
                    robot.keyPress(KeyEvent.VK_A);
                    robot.delay(delay);
                    robot.keyRelease(KeyEvent.VK_A);
                    robot.keyRelease(KeyEvent.VK_SHIFT);
                    break;
                case "B":
                    robot.keyPress(KeyEvent.VK_SHIFT);
                    robot.keyPress(KeyEvent.VK_B);
                    robot.delay(delay);
                    robot.keyRelease(KeyEvent.VK_B);
                    robot.keyRelease(KeyEvent.VK_SHIFT);
                    break;
                case "C":
                    robot.keyPress(KeyEvent.VK_SHIFT);
                    robot.keyPress(KeyEvent.VK_C);
                    robot.delay(delay);
                    robot.keyRelease(KeyEvent.VK_C);
                    robot.keyRelease(KeyEvent.VK_SHIFT);
                    break;
                case "D":
                    robot.keyPress(KeyEvent.VK_SHIFT);
                    robot.keyPress(KeyEvent.VK_D);
                    robot.delay(delay);
                    robot.keyRelease(KeyEvent.VK_D);
                    robot.keyRelease(KeyEvent.VK_SHIFT);
                    break;
                case "E":
                    robot.keyPress(KeyEvent.VK_SHIFT);
                    robot.keyPress(KeyEvent.VK_E);
                    robot.delay(delay);
                    robot.keyRelease(KeyEvent.VK_E);
                    robot.keyRelease(KeyEvent.VK_SHIFT);
                    break;
                case "F":
                    robot.keyPress(KeyEvent.VK_SHIFT);
                    robot.keyPress(KeyEvent.VK_F);
                    robot.delay(delay);
                    robot.keyRelease(KeyEvent.VK_F);
                    robot.keyRelease(KeyEvent.VK_SHIFT);
                    break;
                case "G":
                    robot.keyPress(KeyEvent.VK_SHIFT);
                    robot.keyPress(KeyEvent.VK_G);
                    robot.delay(delay);
                    robot.keyRelease(KeyEvent.VK_G);
                    robot.keyRelease(KeyEvent.VK_SHIFT);
                    break;
                case "H":
                    robot.keyPress(KeyEvent.VK_SHIFT);
                    robot.keyPress(KeyEvent.VK_H);
                    robot.delay(delay);
                    robot.keyRelease(KeyEvent.VK_H);
                    robot.keyRelease(KeyEvent.VK_SHIFT);
                    break;
                case "I":
                    robot.keyPress(KeyEvent.VK_SHIFT);
                    robot.keyPress(KeyEvent.VK_I);
                    robot.delay(delay);
                    robot.keyRelease(KeyEvent.VK_I);
                    robot.keyRelease(KeyEvent.VK_SHIFT);
                    break;
                case "J":
                    robot.keyPress(KeyEvent.VK_SHIFT);
                    robot.keyPress(KeyEvent.VK_J);
                    robot.delay(delay);
                    robot.keyRelease(KeyEvent.VK_J);
                    robot.keyRelease(KeyEvent.VK_SHIFT);
                    break;
                case "K":
                    robot.keyPress(KeyEvent.VK_SHIFT);
                    robot.keyPress(KeyEvent.VK_K);
                    robot.delay(delay);
                    robot.keyRelease(KeyEvent.VK_K);
                    robot.keyRelease(KeyEvent.VK_SHIFT);
                    break;
                case "L":
                    robot.keyPress(KeyEvent.VK_SHIFT);
                    robot.keyPress(KeyEvent.VK_L);
                    robot.delay(delay);
                    robot.keyRelease(KeyEvent.VK_L);
                    robot.keyRelease(KeyEvent.VK_SHIFT);
                    break;
                case "M":
                    robot.keyPress(KeyEvent.VK_SHIFT);
                    robot.keyPress(KeyEvent.VK_M);
                    robot.delay(delay);
                    robot.keyRelease(KeyEvent.VK_M);
                    robot.keyRelease(KeyEvent.VK_SHIFT);
                    break;
                case "N":
                    robot.keyPress(KeyEvent.VK_SHIFT);
                    robot.keyPress(KeyEvent.VK_N);
                    robot.delay(delay);
                    robot.keyRelease(KeyEvent.VK_N);
                    robot.keyRelease(KeyEvent.VK_SHIFT);
                    break;
                case "O":
                    robot.keyPress(KeyEvent.VK_SHIFT);
                    robot.keyPress(KeyEvent.VK_O);
                    robot.delay(delay);
                    robot.keyRelease(KeyEvent.VK_O);
                    robot.keyRelease(KeyEvent.VK_SHIFT);
                    break;
                case "P":
                    robot.keyPress(KeyEvent.VK_SHIFT);
                    robot.keyPress(KeyEvent.VK_P);
                    robot.delay(delay);
                    robot.keyRelease(KeyEvent.VK_P);
                    robot.keyRelease(KeyEvent.VK_SHIFT);
                    break;
                case "Q":
                    robot.keyPress(KeyEvent.VK_SHIFT);
                    robot.keyPress(KeyEvent.VK_Q);
                    robot.delay(delay);
                    robot.keyRelease(KeyEvent.VK_Q);
                    robot.keyRelease(KeyEvent.VK_SHIFT);
                    break;
                case "R":
                    robot.keyPress(KeyEvent.VK_SHIFT);
                    robot.keyPress(KeyEvent.VK_R);
                    robot.delay(delay);
                    robot.keyRelease(KeyEvent.VK_R);
                    robot.keyRelease(KeyEvent.VK_SHIFT);
                    break;
                case "S":
                    robot.keyPress(KeyEvent.VK_SHIFT);
                    robot.keyPress(KeyEvent.VK_S);
                    robot.delay(delay);
                    robot.keyRelease(KeyEvent.VK_S);
                    robot.keyRelease(KeyEvent.VK_SHIFT);
                    break;
                case "T":
                    robot.keyPress(KeyEvent.VK_SHIFT);
                    robot.keyPress(KeyEvent.VK_T);
                    robot.delay(delay);
                    robot.keyRelease(KeyEvent.VK_T);
                    robot.keyRelease(KeyEvent.VK_SHIFT);
                    break;
                case "U":
                    robot.keyPress(KeyEvent.VK_SHIFT);
                    robot.keyPress(KeyEvent.VK_U);
                    robot.delay(delay);
                    robot.keyRelease(KeyEvent.VK_U);
                    robot.keyRelease(KeyEvent.VK_SHIFT);
                    break;
                case "V":
                    robot.keyPress(KeyEvent.VK_SHIFT);
                    robot.keyPress(KeyEvent.VK_V);
                    robot.delay(delay);
                    robot.keyRelease(KeyEvent.VK_V);
                    robot.keyRelease(KeyEvent.VK_SHIFT);
                    break;
                case "W":
                    robot.keyPress(KeyEvent.VK_SHIFT);
                    robot.keyPress(KeyEvent.VK_W);
                    robot.delay(delay);
                    robot.keyRelease(KeyEvent.VK_W);
                    robot.keyRelease(KeyEvent.VK_SHIFT);
                    break;
                case "X":
                    robot.keyPress(KeyEvent.VK_SHIFT);
                    robot.keyPress(KeyEvent.VK_X);
                    robot.delay(delay);
                    robot.keyRelease(KeyEvent.VK_X);
                    robot.keyRelease(KeyEvent.VK_SHIFT);
                    break;
                case "Y":
                    robot.keyPress(KeyEvent.VK_SHIFT);
                    robot.keyPress(KeyEvent.VK_Y);
                    robot.delay(delay);
                    robot.keyRelease(KeyEvent.VK_Y);
                    robot.keyRelease(KeyEvent.VK_SHIFT);
                    break;
                case "Z":
                    robot.keyPress(KeyEvent.VK_SHIFT);
                    robot.keyPress(KeyEvent.VK_Z);
                    robot.delay(delay);
                    robot.keyRelease(KeyEvent.VK_Z);
                    robot.keyRelease(KeyEvent.VK_SHIFT);
                    break;

                //lowercase

                case "a":

                    robot.keyPress(KeyEvent.VK_A);
                    robot.delay(delay);
                    robot.keyRelease(KeyEvent.VK_A);
                    robot.delay(delay);
                    break;
                case "b":

                    robot.keyPress(KeyEvent.VK_B);
                    robot.delay(delay);
                    robot.keyRelease(KeyEvent.VK_B);
                    robot.delay(delay);
                    break;
                case "c":

                    robot.keyPress(KeyEvent.VK_C);
                    robot.delay(delay);
                    robot.keyRelease(KeyEvent.VK_C);
                    robot.delay(delay);
                    break;
                case "d":

                    robot.keyPress(KeyEvent.VK_D);
                    robot.delay(delay);
                    robot.keyRelease(KeyEvent.VK_D);
                    robot.delay(delay);
                    break;
                case "e":

                    robot.keyPress(KeyEvent.VK_E);
                    robot.delay(delay);
                    robot.keyRelease(KeyEvent.VK_E);
                    robot.delay(delay);
                    break;
                case "f":

                    robot.keyPress(KeyEvent.VK_F);
                    robot.delay(delay);
                    robot.keyRelease(KeyEvent.VK_F);
                    robot.delay(delay);
                    break;
                case "g":

                    robot.keyPress(KeyEvent.VK_G);
                    robot.delay(delay);
                    robot.keyRelease(KeyEvent.VK_G);
                    robot.delay(delay);
                    break;
                case "h":

                    robot.keyPress(KeyEvent.VK_H);
                    robot.delay(delay);
                    robot.keyRelease(KeyEvent.VK_H);
                    robot.delay(delay);
                    break;
                case "i":

                    robot.keyPress(KeyEvent.VK_I);
                    robot.delay(delay);
                    robot.keyRelease(KeyEvent.VK_I);
                    robot.delay(delay);
                    break;
                case "j":

                    robot.keyPress(KeyEvent.VK_J);
                    robot.delay(delay);
                    robot.keyRelease(KeyEvent.VK_J);
                    robot.delay(delay);
                    break;
                case "k":

                    robot.keyPress(KeyEvent.VK_K);
                    robot.delay(delay);
                    robot.keyRelease(KeyEvent.VK_K);
                    robot.delay(delay);
                    break;
                case "l":

                    robot.keyPress(KeyEvent.VK_L);
                    robot.delay(delay);
                    robot.keyRelease(KeyEvent.VK_L);
                    robot.delay(delay);
                    break;
                case "m":

                    robot.keyPress(KeyEvent.VK_M);
                    robot.delay(delay);
                    robot.keyRelease(KeyEvent.VK_M);
                    robot.delay(delay);
                    break;
                case "n":

                    robot.keyPress(KeyEvent.VK_N);
                    robot.delay(delay);
                    robot.keyRelease(KeyEvent.VK_N);
                    robot.delay(delay);
                    break;
                case "o":

                    robot.keyPress(KeyEvent.VK_O);
                    robot.delay(delay);
                    robot.keyRelease(KeyEvent.VK_O);
                    robot.delay(delay);
                    break;
                case "p":

                    robot.keyPress(KeyEvent.VK_P);
                    robot.delay(delay);
                    robot.keyRelease(KeyEvent.VK_P);
                    robot.delay(delay);
                    break;
                case "q":

                    robot.keyPress(KeyEvent.VK_Q);
                    robot.delay(delay);
                    robot.keyRelease(KeyEvent.VK_Q);
                    robot.delay(delay);
                    break;
                case "r":

                    robot.keyPress(KeyEvent.VK_R);
                    robot.delay(delay);
                    robot.keyRelease(KeyEvent.VK_R);
                    robot.delay(delay);
                    break;
                case "s":

                    robot.keyPress(KeyEvent.VK_S);
                    robot.delay(delay);
                    robot.keyRelease(KeyEvent.VK_S);
                    robot.delay(delay);
                    break;
                case "t":

                    robot.keyPress(KeyEvent.VK_T);
                    robot.delay(delay);
                    robot.keyRelease(KeyEvent.VK_T);
                    robot.delay(delay);
                    break;
                case "u":

                    robot.keyPress(KeyEvent.VK_U);
                    robot.delay(delay);
                    robot.keyRelease(KeyEvent.VK_U);
                    robot.delay(delay);
                    break;
                case "v":

                    robot.keyPress(KeyEvent.VK_V);
                    robot.delay(delay);
                    robot.keyRelease(KeyEvent.VK_V);
                    robot.delay(delay);
                    break;
                case "w":

                    robot.keyPress(KeyEvent.VK_W);
                    robot.delay(delay);
                    robot.keyRelease(KeyEvent.VK_W);
                    robot.delay(delay);
                    break;
                case "x":

                    robot.keyPress(KeyEvent.VK_X);
                    robot.delay(delay);
                    robot.keyRelease(KeyEvent.VK_X);
                    robot.delay(delay);
                    break;
                case "y":

                    robot.keyPress(KeyEvent.VK_Y);
                    robot.delay(delay);
                    robot.keyRelease(KeyEvent.VK_Y);
                    robot.delay(delay);

                    break;
                case "z":
                    robot.keyPress(KeyEvent.VK_Z);
                    robot.delay(delay);
                    robot.keyRelease(KeyEvent.VK_Z);
                    robot.delay(delay);
                    break;
            }
        } catch (AWTException e) {
            e.printStackTrace();
        }
    }
}
