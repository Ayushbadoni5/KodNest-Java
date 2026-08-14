package track.phoneUnlock;

public class Unlock {
    void phoneUnlocked(Pin pin) {
        System.out.println("Phone unlocked with PIN");
    }

    void phoneUnlocked(Pattern pattern) {
        System.out.println("Phone unlocked with Pattern");

    }

    void phoneUnlocked(FaceRecognisation face) {
        System.out.println("Phone unlocked with Face Recognisation");

    }

    void phoneUnlocked(Biometrics bio) {
        System.out.println("Phone unlocked with Biometrics");
    }

    void phoneUnlocked(Password Password) {
        System.out.println("Phone unlocked with Password");
    }
}