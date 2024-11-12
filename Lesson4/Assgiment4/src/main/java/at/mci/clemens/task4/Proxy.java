/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package at.mci.clemens.task4;

/**
 *
 * @author Clemens
 */
public class Proxy extends Subject{
    private final RealSubject subject;
    private boolean allowence = true;
    private final String[] blacklist = {"microsoft.com", "youtube.com", "chatgpt.com"};

    /**
     *
     */
    public Proxy() {
        this.subject = new RealSubject();
    }

    /**
     *
     * @param webAddress
     */
    @Override
    public void request(String webAddress) {
        for(String blockItem : this.blacklist){
            if (blockItem.equals(webAddress)){
                switch(webAddress){
                    case "microsoft.com":
                        System.out.println("You cant visit microsoft we do openSource here maybe try looking into fsfe.org");
                        this.allowence = false;
                        break;
                    case "youtube.com":
                        System.out.println("You cant visit youtube you should be working");
                        this.allowence = false;
                        break;
                    case "chatgpt.com":
                        System.out.println("You should do the work yourself dont let gpt do your stuff");
                        this.allowence = false;
                        break;
                }
            }
        }
        if(this.allowence){
            System.out.println("You are allowed to vistit " + webAddress);
            this.subject.request(webAddress);
        }
        //set it true again for next request
        this.allowence = true;
    }
    
    
}
