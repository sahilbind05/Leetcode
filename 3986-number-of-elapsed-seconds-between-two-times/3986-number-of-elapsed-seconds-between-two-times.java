class Solution {
    public int secondsBetweenTimes(String startTime, String endTime) {
        
        String []str = startTime.split(":");
        String []end = endTime.split(":");

        int strSecs= Integer.parseInt(str[0])*3600 +
            Integer.parseInt(str[1])*60 +
            Integer.parseInt(str[2]);

         int endSecs= Integer.parseInt(end[0])*3600 +
            Integer.parseInt(end[1])*60 +
            Integer.parseInt(end[2]);

        return endSecs - strSecs;
    }
}