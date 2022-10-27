package assessmentDay;

//Find a pattern in an image.
//
//        Rules
//
//        You are given 2 images: a base image and a pattern which may appear somewhere on this image. Each image is represented by an array of strings, where each element of the array represents a row of porels of
//
//        the image, and each character represents one pixel. Understanding this encoding is not necessary to solve this
//
//        problem, but for your information, a detailed explanation is provided below.
//
//        You must return the position of this pattern in the image, or 1-3,1 f the pattern is not found. If the pattern appears multiple times, return the position of the highest one (the smallest, and in case of equality, the leftmost one (the smallest
//
//        The position of the pattern is represented by the coordinates of its
//
//        top-left comer, represents the
//
//        column, represents the row, and the coordinates (e.oy represents the top-left corner,
//
//        Implementation
//
//        implement the method solve(imagewidth, inayelleight, image, patternkidth, patternlight, pattern) where the parameters are
//
//        imageWith: the image width
//
//        imageereight the image height
//
//        nage the image as an array of strings, where each character represents a pixel
//
//        patternWith the pattern width the pattern height
//
//        the pattern as an array of strings, where each character represents a pixel
//
//        and which should return:
//
//        if the pattern is present in the image the position as an array of 2 integers, representing the top-left corner of the first pattern, going from top to bottom and left to right
//
//        if the pattern is not present in the image. 11.11
//
//        Victory Conditions
//
//        The pattern is indeed located at coordinates)

public class ImagePattern {
            public static int[] solve(int imageWidth, int imageHeight, String[] image, int patternWidth, int patternHeight, String[] pattern) {
                int[] result = new int[2];
                for (int i = 0; i < imageHeight; i++) {
                    for (int j = 0; j < imageWidth; j++) {
                        if (image[i].charAt(j) == pattern[0].charAt(0)) {
                            if (patternHeight == 1 && patternWidth == 1) {
                                result[0] = j;
                                result[1] = i;
                                return result;
                            }
                            if (patternHeight == 1) {
                                if (image[i].substring(j, j + patternWidth).equals(pattern[0])) {
                                    result[0] = j;
                                    result[1] = i;
                                    return result;
                                }
                            } else if (patternWidth == 1) {
                                if (image[i].charAt(j) == pattern[0].charAt(0) && image[i + 1].charAt(j) == pattern[1].charAt(0)) {
                                    result[0] = j;
                                    result[1] = i;
                                    return result;
                                }
                            } else {
                                if (image[i].substring(j, j + patternWidth).equals(pattern[0]) && image[i + 1].substring(j, j + patternWidth).equals(pattern[1])) {
                                    result[0] = j;
                                    result[1] = i;
                                    return result;
                                }
                            }
                        }
                    }
                }
                result[0] = -1;
                result[1] = -1;
                return result;
            }
}
