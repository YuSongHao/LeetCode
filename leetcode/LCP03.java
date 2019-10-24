package leetcode;

/**
 * @program:MyIdeaTest
 * @description:LCP03
 * @author:JasonYu
 * @date:2019-09-26 16-35
 **/
public class LCP03 {
    public static void main(String[] args) {
        String cmd = "URR";
        int[][] obstacles = {{4,2}};
        int[][] goal = {{3,2}};
//        System.out.println(canRobotFinish(cmd,obstacles,goal));
    }
    public static boolean canRobotFinish(String command,int[][] obstacles,int x,int y)
    {
        int[][] robotPos = new int[1][2];
        int strIndex = 0;
        while(robotPos[0][0]<=x&&robotPos[0][1]<=y)
        {
            if(strIndex==command.length())
            {
                strIndex-=command.length();
            }
            char cmdNow=command.charAt(strIndex);
            robotPos = cmdExe(cmdNow,robotPos);
            int robotX = robotPos[0][0];
            int robotY = robotPos[0][1];
            if (obstacles.length!=0&&obstacles[0].length!=0) {
                for (int i = 0; i < obstacles.length; i++) {
                    if (robotX == obstacles[i][0] && robotY == obstacles[i][1])
                        return false;
                }
            }
            if(robotX==x&&robotY==y)
                return true;
            strIndex++;
        }
        return false;
    }

    public static int[][] cmdExe(char cmdNow,int[][] robotPos)
    {
        if (cmdNow=='U')
            robotPos[0][1] = robotPos[0][1]+1;
        if (cmdNow=='R')
            robotPos[0][0] = robotPos[0][0]+1;
        return robotPos;
    }
}
