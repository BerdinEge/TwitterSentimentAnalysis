/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proje;
import java.awt.*;
import java.awt.event.*;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
public class BotHandler extends JFrame  {
	JFrame frame = new JFrame("JFrame Example");
	JPanel panel = new JPanel();	    
        JTextField txtEnter=new JTextField(25);
        JTextArea txtChat = new JTextArea(18,25);                      
        JScrollPane scrollPane = new JScrollPane(txtChat);
        JButton button=new JButton("Ekle");
        JTextField txtId=new JTextField("ID",18);
        JTextField txtMarka=new JTextField("Marka",25);
        JTextField txtModel=new JTextField("Model<hashtag>",25);
        JTextField txtKamera=new JTextField("kamera",25);
        JTextField txtRam=new JTextField("ram",25);
        JTextField txtOS=new JTextField("OS",25);
    /**
     *
     */
    public void arayüz(){
                panel.setLayout(new FlowLayout());
                panel.add(txtEnter);
                scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
                panel.add(scrollPane);
                panel.add(txtId);
                panel.add(button);
                panel.add(txtMarka); 
                panel.add(txtModel);
                panel.add(txtKamera); 
                panel.add(txtRam);
                panel.add(txtOS);
		frame.add(panel);
		frame.setSize(300, 336);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);              
        }	
        final static ArrayList<Electronic> ElectronicList = new ArrayList<Electronic>();
        final static ArrayList<Tweet> tweetList=new ArrayList<>();
	public BotHandler() {}
        private void MenuOlustur(){
            final ArrayList<String> exceptionMessageList = new ArrayList<>(
	        Arrays.asList("maalesef anlasilmadi...", "lutfen tekrarlar misin", "???"));
                final ArrayList<String> greetingMessageList = new ArrayList<>(
	        Arrays.asList("merhabalar","hoşgeldiniz"));
                final ArrayList<String> halhatirList=new ArrayList<>(
                Arrays.asList("İyiyim siz?","teşekkür ederim"));
                final ArrayList<String> vedalasList=new ArrayList<>(
                Arrays.asList("Hoşçakalın"));
                txtEnter.addActionListener(new ActionListener() {                       
                        @Override
			public void actionPerformed(ActionEvent e) {
				String uText = txtEnter.getText();
				txtChat.append("You: " + uText + "\n");
				txtEnter.setText("");
				if (uText.contains("selam")) {decideRandom(greetingMessageList);
                                }else if (uText.contains("nasılsınız")){decideRandom(halhatirList);
                                }else if (uText.contains("güle güle")){decideRandom(vedalasList);
                                }else if (uText.contains("ürün ekleyeceğim")){
                                
                                frame.setSize(300, 520);
                                button.addActionListener( new ActionListener(){
                                    @Override
                                    public void actionPerformed(ActionEvent e)
                                    {   
                                        //ÜRÜN EKLEME
                                        ElectronicFactory new_product = new ElectronicFactory();
                                        String textID=txtId.getText();
                                        String textMarka=txtMarka.getText();
                                        String textModel=txtModel.getText();
                                        String textKamera=txtKamera.getText();
                                        String textRam=txtRam.getText();
                                        String textOS=txtOS.getText();
                                        ElectronicList.add(new_product.getAutomaticElection(Integer.parseInt(textKamera),Integer.parseInt(textRam), textOS,Integer.parseInt(textID) , textMarka, textModel));
                                        System.out.println("ürün eklenmiştir");
                                         try {
                                            //GET POLARİTY ve tweet değeri Ekleme
                                        
                                            Tweet yeni_tweet;
                                            yeni_tweet = new Tweet(new OptimumCalculation(),txtModel.getText());
                                            
                                            tweetList.add(yeni_tweet);
                                            
                                            
                                            for(Tweet t:tweetList){
                                                System.out.println(t.getHashtag()+" "+t.getKutupDegeri());

                                            }
                                        } catch (IOException ex) {
                                            Logger.getLogger(BotHandler.class.getName()).log(Level.SEVERE, null, ex);
                                        }
                                    }
                                });
                               
                                } else if (uText.contains("urun sec")) {
       					// urun secimi
					txtChat.append("AI: " + "Lutfen tür seciniz:" + "\n");
					txtChat.append("AI: " + "1: Telefon" + "\n");
					txtChat.append("AI: " + "2: PC" + "\n");
				} else if (uText.equals("1")) {
					txtChat.append("AI: " + "Cep Telefonu secildi..." + "\n");
					txtChat.append("AI: " + "Listedeki Telefonlar:" + "\n");
                                    for (Electronic ElectronicList1 : ElectronicList) {
                                        if(ElectronicList1 instanceof CellPhone){
                                           CellPhone a = (CellPhone) ElectronicList1;
                                           txtChat.append(a.toString());
                                        }}
                                    
				} else if (uText.equals("2")) {
					txtChat.append("AI: " + "PC secildi..." + "\n");
                                        txtChat.append("AI: " + "Listedeki PC ler:" + "\n");
                                        for (Electronic ElectronicList1 : ElectronicList){
                                        if(ElectronicList1 instanceof PC)
                                        {
                                           PC a = (PC) ElectronicList1;
                                            txtChat.append(a.toString());
                                        }}
                                  } else if (uText.contains("en begenilen urun")) {
                                        Collections.sort(tweetList);
                                        Collections.reverse(tweetList);
                                        System.out.println("En Beğenilen ürün :"+tweetList.get(0).ToString());
                                        
				} else {
					decideRandom(exceptionMessageList);
				}
			}                       
		}); 
        }
       	private void decideRandom(ArrayList<String> messageList) {
		int decider = (int) (Math.random() * messageList.size());
		txtChat.append("AI: " + messageList.get(decider) + "\n");
	}
        public static void main(String[] args) {
            BotHandler bh=new BotHandler();
            bh.arayüz();
            bh.MenuOlustur();           
        }
       
        
}

