/*Title: Jeet
  Abstract: Creating a class Jeet to fulfill all your microblogging needs(input/output data and plagiarism checks).
  Author: Sahil Sinha
  Date: 17 September 2020`
*/
public class Jeet {
    private String emoticon,fullName,userName,jeet,dateTime,output;
    private boolean veriStatus;
    static private int NumJeets=0,NumFakeJeets=0;

    public Jeet(String emoticon, String fullName, String userName, boolean veriStatus) {
        this.emoticon = emoticon;
        this.fullName = fullName;
        this.userName = userName;
        this.veriStatus = veriStatus;
        NumJeets+=1;
    }

    public Jeet() {

    }

    public void setDate(JitterDate d){
        dateTime=d.toString();

    }
    public void setJeet(String s){
        jeet=s;
    }

    public void plagiarismCheck(Jeet j){
        this.jeet= (j.jeet.equals(this.jeet))?(" [Plagiarism detected. Text removed.]"):(jeet);
        if(this.jeet.equals(" [Plagiarism detected. Text removed.]")){
            NumJeets-=1;
            NumFakeJeets+=1;

        }
    }

    public static int getNumJeets() {
        return NumJeets;
    }

    public static int getNumFakeJeets() {
        return NumFakeJeets;
    }

    @Override
    public String toString() {
        if (this.veriStatus == true) {

            output= (emoticon+" "+fullName+" ✓ @"+userName)+"\n";
        }
        else{
            output= (emoticon+" "+fullName+" @"+userName+"\n");
        }

        if(jeet.length()<=140){
            output=output+jeet+"\n";
        }
        else{
            output=output+(jeet.substring(0,137)+"...\n");
        }

        output=output+dateTime+"\n";

        return output;
    }
}


