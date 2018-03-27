package training.acn.com.bootstrap.utils;

import java.util.Random;

import training.acn.com.bootstrap.R;

/**
 * Created by afnan.khaleel on 27-Mar-18.
 */

public class Utilities {

    public static int getRandomImage() {
        Random random = new Random();
        int resourceId;

        int index = random.nextInt() % 3;
        switch (index) {
            case 0:
                resourceId = R.drawable.pic2;
                break;
            case 1:
                resourceId = R.drawable.robot1;
                break;
            case 2:
                resourceId = R.drawable.pic4;
                break;
            default:
                resourceId = R.drawable.pic2;

        }
        return resourceId;
    }
}
