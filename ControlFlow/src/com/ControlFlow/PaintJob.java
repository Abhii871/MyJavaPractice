package com.ControlFlow;

public class PaintJob {

    public static void main(String[] args) {
        int actualBucketCount = getBucketCount(3.4, 2.1, 1.5, 2);
        System.out.println(actualBucketCount);
    }

    public static int getBucketCount(double width, double height, double areaPerBucket, int extraBuckets) {
        if (width <= 0 || height <= 0 || areaPerBucket <= 0 || extraBuckets < 0) {
            return -1;
        } else {
            double areaOfWall = height * width;
            double temp = Math.ceil(areaOfWall / areaPerBucket);
            int bucketCount = (int) temp;
            int actualBucketCount = bucketCount - extraBuckets;
            return actualBucketCount;
        }
    }

    public static int getBucketCount(double width, double height, double areaPerBucket) {
        if (width <= 0 || height <= 0 || areaPerBucket <= 0) {
            return -1;
        } else {
            double areaOfWall = height * width;
            double temp = Math.ceil(areaOfWall / areaPerBucket);
            int bucketCount = (int) temp;
            return bucketCount;
        }
    }
    public static int getBucketCount(double area ,double areaPerBucket) {
        if (area <= 0 || areaPerBucket <= 0) {
            return -1;
        } else {
            double temp = Math.ceil(area / areaPerBucket);
            int bucketCount = (int) temp;
            return bucketCount;
        }
    }
}