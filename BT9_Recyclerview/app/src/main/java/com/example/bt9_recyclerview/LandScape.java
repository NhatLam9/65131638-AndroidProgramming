package com.example.bt9_recyclerview;

public class LandScape {
    String LandImageFileName;
    String LandCaption;

    public LandScape(String landImageFileName, String landCaption) {
        this.LandImageFileName = landImageFileName;
        this.LandCaption = landCaption;
    }

    public String getLandImageFileName() {
        return LandImageFileName;
    }

    public void setLandImageFileName(String landImageFileName) {
        LandImageFileName = landImageFileName;
    }

    public String getLandCation() {
        return LandCaption;
    }

    public void setLandCation(String landCation) {
        LandCaption = landCation;
    }
}