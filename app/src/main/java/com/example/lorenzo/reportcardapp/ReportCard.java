package com.example.lorenzo.reportcardapp;

/**
 * A class to represent a report card with grades for each subject.
 * Grades are informed as percentages from 0 to 100 so they are stored as int.
 * <p>
 * When instantiated without parameters, each subject is assigned a -1 value as
 * a "not yet informed" mark.
 */
public class ReportCard {

    static final int NOT_YET_INFORMED = -1;

    private int mMathsGrade;
    private int mLanguageGrade;
    private int mScienceGrade;
    private int mHealthGrade;
    private int mArtGrade;
    private int mMusicGrade;

    public ReportCard() {
        this.mMathsGrade = NOT_YET_INFORMED;
        this.mLanguageGrade = NOT_YET_INFORMED;
        this.mScienceGrade = NOT_YET_INFORMED;
        this.mHealthGrade = NOT_YET_INFORMED;
        this.mArtGrade = NOT_YET_INFORMED;
        this.mMusicGrade = NOT_YET_INFORMED;
    }

    public ReportCard(int mMathsGrade, int mLanguageGrade, int mScienceGrade, int mHealthGrade, int mArtGrade, int mMusicGrade) {
        this.mMathsGrade = mMathsGrade;
        this.mLanguageGrade = mLanguageGrade;
        this.mScienceGrade = mScienceGrade;
        this.mHealthGrade = mHealthGrade;
        this.mArtGrade = mArtGrade;
        this.mMusicGrade = mMusicGrade;
    }

    public int getmMathsGrade() {
        return mMathsGrade;
    }

    public void setmMathsGrade(int mMathsGrade) {
        this.mMathsGrade = mMathsGrade;
    }

    public int getmLanguageGrade() {
        return mLanguageGrade;
    }

    public void setmLanguageGrade(int mLanguageGrade) {
        this.mLanguageGrade = mLanguageGrade;
    }

    public int getmScienceGrade() {
        return mScienceGrade;
    }

    public void setmScienceGrade(int mScienceGrade) {
        this.mScienceGrade = mScienceGrade;
    }

    public int getmHealthGrade() {
        return mHealthGrade;
    }

    public void setmHealthGrade(int mHealthGrade) {
        this.mHealthGrade = mHealthGrade;
    }

    public int getmArtGrade() {
        return mArtGrade;
    }

    public void setmArtGrade(int mArtGrade) {
        this.mArtGrade = mArtGrade;
    }

    public int getmMusicGrade() {
        return mMusicGrade;
    }

    public void setmMusicGrade(int mMusicGrade) {
        this.mMusicGrade = mMusicGrade;
    }

    @Override
    public String toString() {
        return "ReportCard{" +
                "Maths=" + mMathsGrade +
                ", Language=" + mLanguageGrade +
                ", Science=" + mScienceGrade +
                ", Health=" + mHealthGrade +
                ", Art=" + mArtGrade +
                ", Music=" + mMusicGrade +
                '}';
    }
}
