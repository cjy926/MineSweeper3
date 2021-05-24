package entity;

import java.util.Random;

public class Player {

    private static Random ran = new Random();

    private String userName;
    private int score = 0;
    private int mistake = 0;
    private int addscore=0;
    private int costscore=0;


    /**
     * 通过特定名字初始化一个玩家对象。
     * @param userName 玩家的名字
     */

    public Player(String userName){
        this.userName = userName;
    }

    /**
     * 通过默认名字初始化一个玩家对象。
     */
    public Player(){
        this.userName = "User#"+(ran.nextInt(9000)+1000);
    }


    public int getCostscore() {
        return costscore;
    }

    public int getAddscore() {
        return addscore;
    }

    /**
     * 为玩家加一分。
     */

    public void addScore(){
        score++;
        addscore++;
    }

    /**
     * 为玩家扣一分。
     */
    public void costScore(){
        score--;
        costscore++;
    }

    /**
     * 为玩家增加一次失误数。
     */
    public void addMistake() { mistake++; }


    public int getScore(){
        return score;
    }
    public String getUserName(){ return userName; }
    public int getMistake(){ return mistake; }

}