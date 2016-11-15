
public class tt extends javax.swing.JFrame {

  
    public tt() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setBackground(new java.awt.Color(153, 153, 153));
        jButton1.setText("jButton1");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 330, -1, -1));

        jButton2.setBackground(new java.awt.Color(153, 153, 153));
        jButton2.setText("jButton2");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 330, -1, -1));

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Documents and Settings\\Sir\\Desktop\\Project\\Graphix\\random\\virginia-duran-blog-amazing-airports-beijing-international-airport.jpg")); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-660, -70, 1290, 670));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
 String[] origin, destination, airlines;
 int[] Fare;
  origin = new String[51];
  destination = new String[51];
  airlines = new String[51];
  Fare = new int[51];
airlines[0] = "AA";//American airlines
airlines[1] = "AI";//Air India
airlines[2] = "BA";//British Airways
airlines[3] = "CP";//Cathay Pacific
airlines[4] = "DL";//Delta
airlines[5] = "EM";//Emirates
airlines[6] = "HL";//Hellnic
airlines[7] = "LH";//Lufthansa
airlines[8] = "SA";//Singapore
airlines[9] = "UA";//United
airlines[10] = "VA";//Virgin Atlantic
airlines[11] = "AC";//Air Canada
airlines[12] = "TA";//Turkish Airlines
airlines[13] = "KL";//KLM
airlines[14] = "9W";//Jet Airways
airlines[15] = "KA";//Korean Air
airlines[16] = "AS";//Asiana
airlines[17] = "EA";//Eastern china
airlines[18] = "GA";//Gulf Air
airlines[19] = "SF";//South African
airlines[20] = "AZ";//Air Newzeland
airlines[21] = "QF";//Qantas
airlines[22] = "AN";//Japan
airlines[22] = "TH";//Thai
airlines[23] = "MY";//Malasian Airlines
airlines[24] = "TW";//TWA
airlines[25] = "CL";//Continental
airlines[26] = "AB";//Air Berlin
airlines[27] = "CA";//Corse Air
airlines[28] = "FL";//Aerofloat
airlines[29] = "SS";//Scandinavian Airways
airlines[30] = "EA";//Egypt Air
airlines[31] = "FA";//Fin Air
airlines[32] = "AM";//Air Mauritius
airlines[33] = "AA";//American airlines
airlines[34] = "AI";//Air India
airlines[35] = "BA";//British Airways
airlines[36] = "CP";//Cathay Pacific
airlines[37] = "DL";//Delta
airlines[38] = "EM";//Emirates
airlines[39] = "HL";//Hellnic
airlines[40] = "LH";//Lufthansa
airlines[41] = "SA";//Singapore
airlines[42] = "UA";//United
airlines[43] = "VA";//Virgin Atlantic
airlines[44] = "AC";//Air Canada
airlines[45] = "TA";//Turkish Airlines
airlines[46] = "KL";//KLM
airlines[47] = "AZ";//Air Newzeland
airlines[48] = "QF";//Qantas
airlines[49] = "LH";//Lufthansa
airlines[50] = "EM";//Emirates


  origin[0] = "Dubai";
  origin[1] = "Frankfurt";
  origin[2] = "Los Angeles";
  origin[3] = "Athens";
  origin[4] = "New Delhi";
  origin[5] = "Mumbai";
  origin[6] = "Prague";
  origin[7]= "Singapore";
  origin[8] = "London";
  origin[9]="Manchester";
  origin[10]="Madrid";
  origin[11]="San Francisco";
  origin[12]="New York";
  origin[13]="Berlin";
  origin[14]="Seattle";
  origin[15]="Munich";
  origin[16]="Vancouver";
  origin[17]="Milan";
  origin[18]="Istanbul";
  origin[19]="Johannesberg";
  origin[20]= "Cairo";
  origin[21]= "Ottawa";
  origin[22] = "Amsterdam";
  origin[23]= "Mauritius";
  origin[24] = "Stockholm";
  origin[25] = "St.Petersburg";
  origin[26] = "Reykjavík";
  origin[27] = "Kualalampur";
  origin[28] = "Paris";
  origin[29] = "Zurich";
  origin[30] = "Haiti";
  origin[31] = "Rio De Janerio";
  origin[32] = "Buenos Aires";
  origin[33] = "Mexico City";
  origin[34] = "Narita";
  origin[35] = "Hong Kong";
  origin[36]= "Seoul";
  origin[37] = "Honolulu";
  origin[38] = "Miami";
  origin[39] = "Auckland";
  origin[40] = "Zagreb";
  origin[41] = "Kiev";
  origin[42]= "Boston";
  origin[43] = "Warsaw";
  origin[44] = "Atlanta";
  origin[45] = "Chicago";
  origin[46] = "Toronto";
  origin[47]= "Dallas";
  origin[48]= "Oslo";
  origin[49] = "Helsinki";
  origin[50] = "Washington D.C.";
  
  
 destination[0] = "Dubai";
  destination[1] = "Frankfurt";
  destination[2] = "Los Angeles";
  destination[3] = "Athens";
  destination[4] = "New Delhi";
  destination[5] = "Mumbai";
  destination[6] = "Prague";
  destination[7]= "Singapore";
  destination[8] = "London";
  destination[9]="Manchester";
  destination[10]="Madrid";
  destination[11]="San Francisco";
  destination[12]="New York";
  destination[13]="Berlin";
  destination[14]="Seattle";
  destination[15]="Munich";
  destination[16]="Vancouver";
  destination[17]="Milan";
  destination[18]="Istanbul";
  destination[19]="Johannesberg";
  destination[20]= "Cairo";
  destination[21]= "Ottawa";
  destination[22] = "Amsterdam";
  destination[23]= "Mauritius";
  destination[24] = "Stockholm";
  destination[25] = "St.Petersburg";
  destination[26] = "Reykjavík";
  destination[27] = "Kualalampur";
  destination[28] = "Paris";
  destination[29] = "Zurich";
  destination[30] = "Haiti";
  destination[31] = "Rio De Janerio";
  destination[32] = "Buenos Aires";
  destination[33] = "Mexico City";
  destination[34] = "Narita";
  destination[35] = "Hong Kong";
  destination[36]= "Seoul";
  destination[37] = "Honolulu";
  destination[38] = "Miami";
  destination[39] = "Auckland";
  destination[40] = "Zagreb";
  destination[41] = "Kiev";
  destination[42]= "Boston";
  destination[43] = "Warsaw";
  destination[44] = "Atlanta";
  destination[45] = "Chicago";
  destination[46] = "Toronto";
  destination[47]= "Dallas";
  destination[48]= "Oslo";
  destination[49] = "Helsinki";
  destination[50] = "Washington D.C.";
Fare[0]=20000;
Fare[1]=23000;
Fare[2]=26000;
Fare[3]=29000;
Fare[4]=32000;
Fare[5]=35000;
Fare[6]=38000;
Fare[7]=41000;
Fare[8]=44000;
Fare[9]=47000;
Fare[10]=50000;
Fare[11]=53000;
Fare[12]=56000;
Fare[13]=59000;
Fare[14]=62000;
Fare[15]=20000;
Fare[16]=23000;
Fare[17]=26000;
Fare[18]=29000;
Fare[19]=32000;
Fare[20]=35000;
Fare[21]=38000;
Fare[22]=41000;
Fare[23]=44000;
Fare[24]=47000;
Fare[25]=50000;
Fare[26]=53000;
Fare[27]=56000;
Fare[28]=59000;
Fare[29]=62000;
Fare[30]=20000;
Fare[31]=23000;
Fare[32]=26000;
Fare[33]=29000;
Fare[34]=32000;
Fare[35]=35000;
Fare[36]=38000;
Fare[37]=41000;
Fare[38]=44000;
Fare[39]=47000;
Fare[40]=50000;
Fare[41]=53000;
Fare[42]=56000;
Fare[43]=59000;
Fare[44]=62000;
Fare[45]=20000;
Fare[46]=23000;
Fare[47]=26000;
Fare[48]=29000;
Fare[49]=32000;
Fare[50]=35000;
      
  /*int randomNumber = ( int )( Math.random() * 999 );

if( randomNumber <= 100 ) {
    randomNumber = randomNumber + 100;
    System.out.println(randomNumber);
}
if(randomNumber>100)
System.out.println(randomNumber);
*//*
        int ts =100;
        int h =0;
             int m = 0;
     
      int fnp=100 ;  
        for(int k=1;k<=5;k++){
for(int i =0;i<=50;i++) 
    
 {  
   
      
      fnp +=i;
     for(int j = 0;j<=50;j++)
     {
    
         h=h+1;
         if(h==24)
             h = 0;
    
         m=m+30;
         if(m==60)
             m=0;
         ts = ts +50;
         if(ts>300)
             ts = 100;
     int vs = ts-50;
  System.out.println("insert into flights values('"+ origin[i] +  "','"+ destination[j] + "','" + airlines[j] + fnp + "','0" + h + ":" + m + ":00" + "'," + vs + "," + ts + "," + Fare[i]+ ");");
          fnp++;
       }
 }
         */
    
/*
        int j = 20000;
   for (int i =0;i<=50;i++)  
   {
       System.out.println("Fare["+i+"]" + "="+ j + ";");
       j=j+3000;
       if(j==65000)
       {
           j = 20000;
       }
   }}

  */ 
        
        for(int i = 0;i<=50;i++)
            System.out.println(Origin[i]);
    }//GEN-LAST:event_jButton1ActionPerformed
   
private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
// TODO add your handling code here:
}//GEN-LAST:event_jButton2ActionPerformed
  
     public static void main(String args[]) {
      
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the
         * default look and feel. For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(tt.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(tt.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(tt.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(tt.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

      
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new tt().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
