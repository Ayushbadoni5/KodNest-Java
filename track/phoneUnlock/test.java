package track.phoneUnlock;

import java.util.Scanner;

public class test {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Unlock your phone (using pin, pattern, face, biometrics or password):");
        String string = sc.nextLine();
        Unlock unlock = new Unlock();
        Pin pin = new Pin();
        Pattern pattern = new Pattern();
        FaceRecognisation face = new FaceRecognisation();
        Biometrics bio = new Biometrics();
        Password password = new Password();

        switch (string) {
            case "pin":
                unlock.phoneUnlocked(pin);
                break;
            case "pattern":
                unlock.phoneUnlocked(pattern);
                ;
                break;
            case "face":
                unlock.phoneUnlocked(face);
                ;
                break;
            case "biometrics":
                unlock.phoneUnlocked(bio);
                ;
                break;
            case "password":
                unlock.phoneUnlocked(password);
                ;
                break;
            default:
                break;
        }

    }

}