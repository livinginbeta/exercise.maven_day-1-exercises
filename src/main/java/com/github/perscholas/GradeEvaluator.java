package com.github.perscholas;

/**
 * Created by leon on 7/14/2020.
 */
public class GradeEvaluator {
    public Boolean isGradeA(Double score) {
        if (score <= 100 && score >= 90) {
            return true;
        }
        return false;
    }

    public Boolean isGradeB(Double score) {
        if (score < 90 && score >= 80) {
            return true;
        }
        return false;
    }

    public Boolean isGradeC(Double score) {
        if (score >= 70) {
            return true;
        }
        return false;
    }

    public Boolean isGradeD(Double score) {
        if (score >= 65) {
            return true;
        }
        return false;
    }

    public Boolean isGradeF(Double score) {
        if (score < 65 && score >= 0) {
            return true;
        }
        return false;
    }

    public Character getGrade(Double score) {
        if (score >= 90) {
            return 'A';
        }

        if (score >= 80) {
            return 'B';
        }

        if (score >= 70) {
            return 'C';
        }


        if (score >= 65) {
            return 'D';
        }

        if (score < 65 && score >= 0) {
            return 'F';
        }

        return null;
    }
}
