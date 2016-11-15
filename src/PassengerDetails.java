
import java.sql.DriverManager;
import java.sql.ResultSet;
import javax.swing.JOptionPane;


public class PassengerDetails extends javax.swing.JFrame {
String[] pNameA ,pAgeA, pGenA, pNameC, pAgeC, pGenC, pAgeI, pNameI,pGenI;
int lifetime_bookings = 1112;
int nA = Integer.parseInt((String)Booking.nAdults.getSelectedItem());
int nC = Integer.parseInt((String)Booking.nChildren.getSelectedItem());
int nI = Integer.parseInt((String)Booking.nInfants.getSelectedItem());


//String bid  = "AA234";
//public static int phone;



    public PassengerDetails() {
        initComponents();
        pNameA = new String[8];
        pAgeA = new String[8];
        pGenA= new String[8];
        pNameC = new String[8];
        pAgeC = new String[8];
        pGenC = new String [8];
        pNameI = new String[8];
        pGenI = new String[8];
        pAgeI=new String[8];
    

// adult1.setVisible(false);9301145650
adult2.setVisible(false);
adult3.setVisible(false);
adult4.setVisible(false);
adult5.setVisible(false);
child1.setVisible(false);
child2.setVisible(false);
child3.setVisible(false);
infant1.setVisible(false);
infant2.setVisible(false);
//ageA1.setVisible(false);
ageA2.setVisible(false);
ageA3.setVisible(false);        
ageA4.setVisible(false);
ageA5.setVisible(false);
// GA1.setVisible(false);
GA2.setVisible(false);
GA3.setVisible(false);
GA4.setVisible(false);
GA5.setVisible(false);
ageC1.setVisible(false);
ageC2.setVisible(false);
ageC3.setVisible(false);        
GC1.setVisible(false);
GC2.setVisible(false);
GC3.setVisible(false);
ageI1.setVisible(false);
ageI2.setVisible(false);
GI1.setVisible(false);
GI2.setVisible(false);


int i;
  for (i=1;i<=nA;i++){
      if(i==1){
      adult1.setVisible(true);
      ageA1.setVisible(true);
       GA1.setVisible(true);
      }
      if(i==2){
          adult2.setVisible(true);
      ageA2.setVisible(true);
       GA2.setVisible(true);
      }
       if(i==3){
          adult3.setVisible(true);
       ageA3.setVisible(true);
        GA3.setVisible(true);
       }
        if(i==4){
          adult4.setVisible(true);
        ageA4.setVisible(true);
         GA4.setVisible(true);
        }
         if(i==5){
          adult5.setVisible(true);
         ageA5.setVisible(true);
          GA5.setVisible(true);
         }
  
    }
 
       
 for (int j=1;j<=nC;j++){
      if(j==1){
      child1.setVisible(true);
      ageC1.setVisible(true);
       GC1.setVisible(true);
      }
      if(j==2){
          child2.setVisible(true);
      ageC2.setVisible(true);
       GC2.setVisible(true);
      }
       if(j==3){
          child3.setVisible(true);
       ageC3.setVisible(true);
        GC3.setVisible(true);
       }
       
 }
  for (int k=0;k<=nI;k++){
      if(k==1){
      infant1.setVisible(true);
      ageI1.setVisible(true);
      GI1.setVisible(true);
      }
      if(k==2){
          infant2.setVisible(true);
      ageI2.setVisible(true);
      GI2.setVisible(true);
      }
 
 
   }
   
    
  
  
  
 
  
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        adult1 = new javax.swing.JTextField();
        adult2 = new javax.swing.JTextField();
        adult3 = new javax.swing.JTextField();
        adult4 = new javax.swing.JTextField();
        adult5 = new javax.swing.JTextField();
        child1 = new javax.swing.JTextField();
        child2 = new javax.swing.JTextField();
        child3 = new javax.swing.JTextField();
        infant1 = new javax.swing.JTextField();
        infant2 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        ageA1 = new javax.swing.JTextField();
        ageA2 = new javax.swing.JTextField();
        ageA3 = new javax.swing.JTextField();
        ageA4 = new javax.swing.JTextField();
        ageA5 = new javax.swing.JTextField();
        GA1 = new javax.swing.JComboBox();
        GA2 = new javax.swing.JComboBox();
        GA3 = new javax.swing.JComboBox();
        GA4 = new javax.swing.JComboBox();
        GA5 = new javax.swing.JComboBox();
        jLabel5 = new javax.swing.JLabel();
        ageC1 = new javax.swing.JTextField();
        ageC2 = new javax.swing.JTextField();
        ageC3 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        GC1 = new javax.swing.JComboBox();
        GC2 = new javax.swing.JComboBox();
        GC3 = new javax.swing.JComboBox();
        ageI1 = new javax.swing.JTextField();
        ageI2 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        GI1 = new javax.swing.JComboBox();
        GI2 = new javax.swing.JComboBox();
        Age = new javax.swing.JLabel();
        Gender = new javax.swing.JLabel();
        txtPhone = new javax.swing.JTextField();
        Mobile = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel17 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jButton2 = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(adult1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, 70, -1));
        jPanel1.add(adult2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, 70, -1));

        adult3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adult3ActionPerformed(evt);
            }
        });
        jPanel1.add(adult3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, 70, -1));
        jPanel1.add(adult4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, 70, -1));
        jPanel1.add(adult5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, 70, -1));

        child1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                child1ActionPerformed(evt);
            }
        });
        jPanel1.add(child1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 60, 60, -1));
        jPanel1.add(child2, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 90, 60, -1));
        jPanel1.add(child3, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 120, 60, -1));
        jPanel1.add(infant1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 300, 50, -1));
        jPanel1.add(infant2, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 330, 50, -1));

        jLabel1.setFont(new java.awt.Font("BIRTH OF A HERO", 0, 18));
        jLabel1.setText("Adults");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 10, -1, -1));

        jLabel2.setFont(new java.awt.Font("BIRTH OF A HERO", 0, 18));
        jLabel2.setText("Children");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 10, -1, -1));

        jLabel3.setFont(new java.awt.Font("BIRTH OF A HERO", 0, 18));
        jLabel3.setText("Infants");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 240, -1, -1));

        jLabel4.setFont(new java.awt.Font("BIRTH OF A HERO", 0, 18));
        jLabel4.setText("Name");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, -1, -1));

        jLabel6.setFont(new java.awt.Font("BIRTH OF A HERO", 0, 18));
        jLabel6.setText("Age");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 30, -1, -1));
        jPanel1.add(ageA1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 60, 70, -1));
        jPanel1.add(ageA2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 90, 70, -1));
        jPanel1.add(ageA3, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 120, 70, -1));
        jPanel1.add(ageA4, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 150, 70, -1));
        jPanel1.add(ageA5, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 180, 70, -1));

        GA1.setFont(new java.awt.Font("BIRTH OF A HERO", 0, 18));
        GA1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Male", "Female" }));
        jPanel1.add(GA1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 60, -1, -1));

        GA2.setFont(new java.awt.Font("BIRTH OF A HERO", 0, 18));
        GA2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Male", "Female" }));
        jPanel1.add(GA2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 90, -1, -1));

        GA3.setFont(new java.awt.Font("BIRTH OF A HERO", 0, 18));
        GA3.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Male", "Female" }));
        jPanel1.add(GA3, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 120, -1, -1));

        GA4.setFont(new java.awt.Font("BIRTH OF A HERO", 0, 18));
        GA4.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Male", "Female" }));
        jPanel1.add(GA4, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 150, -1, -1));

        GA5.setFont(new java.awt.Font("BIRTH OF A HERO", 0, 18));
        GA5.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Male", "Female" }));
        jPanel1.add(GA5, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 180, -1, -1));

        jLabel5.setFont(new java.awt.Font("BIRTH OF A HERO", 0, 18));
        jLabel5.setText("Gender");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 30, -1, -1));
        jPanel1.add(ageC1, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 60, 60, -1));
        jPanel1.add(ageC2, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 90, 60, -1));
        jPanel1.add(ageC3, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 120, 60, -1));

        jLabel7.setFont(new java.awt.Font("BIRTH OF A HERO", 0, 18));
        jLabel7.setText("Name");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 40, -1, -1));

        jLabel8.setFont(new java.awt.Font("BIRTH OF A HERO", 0, 18));
        jLabel8.setText("Age");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 40, -1, -1));

        jLabel9.setFont(new java.awt.Font("BIRTH OF A HERO", 0, 18));
        jLabel9.setText("Gender");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 30, -1, -1));

        GC1.setFont(new java.awt.Font("BIRTH OF A HERO", 0, 18));
        GC1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Male", "Female" }));
        jPanel1.add(GC1, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 60, -1, -1));

        GC2.setFont(new java.awt.Font("BIRTH OF A HERO", 0, 18));
        GC2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Male", "Female" }));
        jPanel1.add(GC2, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 90, -1, -1));

        GC3.setFont(new java.awt.Font("BIRTH OF A HERO", 0, 18));
        GC3.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Male", "Female" }));
        jPanel1.add(GC3, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 120, -1, -1));
        jPanel1.add(ageI1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 300, 60, -1));
        jPanel1.add(ageI2, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 330, 60, -1));

        jLabel10.setFont(new java.awt.Font("BIRTH OF A HERO", 0, 18));
        jLabel10.setText("Name");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 270, -1, -1));

        GI1.setFont(new java.awt.Font("BIRTH OF A HERO", 0, 18));
        GI1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Male", "Female" }));
        jPanel1.add(GI1, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 300, -1, -1));

        GI2.setFont(new java.awt.Font("BIRTH OF A HERO", 0, 18));
        GI2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Male", "Female" }));
        jPanel1.add(GI2, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 330, -1, -1));

        Age.setFont(new java.awt.Font("BIRTH OF A HERO", 0, 18));
        Age.setText("Age");
        jPanel1.add(Age, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 270, -1, -1));

        Gender.setFont(new java.awt.Font("BIRTH OF A HERO", 0, 18));
        Gender.setText("Gender");
        jPanel1.add(Gender, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 270, -1, -1));
        jPanel1.add(txtPhone, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, 70, -1));

        Mobile.setText("Contact No.");
        jPanel1.add(Mobile, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, -1, -1));

        jLabel12.setFont(new java.awt.Font("BIRTH OF A HERO", 0, 48));
        jLabel12.setText("Go an Extra Mile");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 40, 380, 50));

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 40, 10, 660));

        jLabel13.setFont(new java.awt.Font("BIRTH OF A HERO", 0, 36));
        jLabel13.setText("Join Our Frequent Flyer Program");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 110, 410, -1));

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/420-Frequent-Flyer-Credit-c-420x0.jpg"))); // NOI18N
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 160, 400, -1));

        jLabel15.setFont(new java.awt.Font("BIRTH OF A HERO", 0, 36));
        jLabel15.setText("And Earn Rewards");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 440, -1, -1));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 520, -1, -1));

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Four-Steps-for-Frequent-Flyer.jpg"))); // NOI18N
        jPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 490, 430, 190));

        jSeparator3.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 560, 30, 140));

        jButton2.setFont(new java.awt.Font("BIRTH OF A HERO", 0, 18)); // NOI18N
        jButton2.setText("Next");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 320, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1040, 710));
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(-670, -100, 1690, 700));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void adult3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adult3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_adult3ActionPerformed

    private void child1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_child1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_child1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
   long phone = Long.parseLong(txtPhone.getText());
  String tdate = Booking.txtDate.getText();
int randomNumber = ( int )( Math.random() * 999 );

if( randomNumber <= 100 ) {
    randomNumber = randomNumber + 100;
    System.out.println(randomNumber);
}
if(randomNumber>100)
System.out.println(randomNumber);
   String bid = mainClass.sel + randomNumber;
   mainClass.bid = bid;
   System.out.println(bid);
   for(int z1=0;z1<=nA-1;z1++)
  {         
      if(z1==0){
      pNameA[z1]=adult1.getText() ;
       pAgeA[z1]=ageA1.getText() ;
       pGenA[z1]=(String)GA1.getSelectedItem();
      }
      if(z1==1){
          
      
      pNameA[z1]=adult2.getText() ;
         pAgeA[z1]=ageA2.getText() ;
         pGenA[z1]=(String)GA2.getSelectedItem();
     
      }
 if(z1==2){
                pNameA[z1]=adult3.getText() ; 
             
                 pAgeA[z1]=ageA3.getText() ; 
                 pGenA[z1]=(String)GA3.getSelectedItem();
 
 }
  if(z1==3){
                pNameA[z1]=adult4.getText() ;
                 pAgeA[z1]=ageA4.getText() ;
                pGenA[z1]=(String)GA4.getSelectedItem();
  }
   if(z1==4){
                pNameA[z1]=adult5.getText() ;
                 pAgeA[z1]=ageA5.getText() ;
                  pGenA[z1]=(String)GA5.getSelectedItem();
   }
     String query2A = "insert into bookingdata values('" + bid + "','" + pNameA[z1]+"'," + pAgeA[z1]+",'" + pGenA[z1] + "'," + phone + ",'" + tdate + "'," + mainClass.fare+",null,'" +mainClass.sel +"');";
   
        System.out.println(query2A);
        try {
            Class.forName("com.mysql.jdbc.Driver");
       
            java.sql.Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/pro", "root", "peace");
            java.sql.Statement stmt = con.createStatement();      
           stmt.executeUpdate(query2A);
           stmt.close();
            con.close();
              
        }
        catch (Exception e)
        {
            JOptionPane.showMessageDialog(null,e);
        }
  
         
    }//GEN-LAST:event_jButton2ActionPerformed


for(int z2=0;z2<=nC-1;z2++)
  {
      if(z2==0){
      pNameC[z2]=child1.getText() ;
       pAgeC[z2]=ageC1.getText() ;
       pGenC[z2]=(String)GC1.getSelectedItem();
      }
      if(z2==1){
          
      
      pNameC[z2]=child2.getText() ;
         pAgeC[z2]=ageC2.getText() ;
         pGenC[z2]=(String)GC2.getSelectedItem();
     
      }
 if(z2==2){
                pNameC[z2]=child3.getText() ; 
             
                 pAgeC[z2]=ageC3.getText() ; 
    pGenC[z2]=(String)GC3.getSelectedItem();

}
String query2C ="insert into bookingdata values('" + bid + "','" + pNameC[z2]+"'," + pAgeC[z2]+",'" + pGenC[z2] + "'," + phone + ",'" + tdate +"'," + mainClass.fare +",null,'"+ mainClass.sel +"');";

try {
Class.forName("com.mysql.jdbc.Driver");

java.sql.Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/pro", "root", "peace");
java.sql.Statement stmt = con.createStatement();      
stmt.executeUpdate(query2C);
stmt.close();
con.close();

}
catch (Exception e)
{
JOptionPane.showMessageDialog(null,e);
}

}
for (int z3 = 0;z3<=nI-1;z3++)
{
if(z3==0){
pNameI[z3]=infant1.getText() ;
pAgeI[z3]=ageI1.getText() ;
pGenI[z3]=(String)GI1.getSelectedItem();
}
if(z3==1){


pNameI[z3]=infant2.getText() ;
pAgeI[z3]=ageI2.getText() ;
pGenI[z3]=(String)GI2.getSelectedItem();

}
String query2I = "insert into bookingdata values('"+ bid + "','" + pNameI[z3]+"'," + pAgeI[z3]+",'" + pGenI[z3] + "'," + phone  + ",'"+ tdate + "',"+ 0+ ",null,'" +mainClass.sel+ "');";

try {
Class.forName("com.mysql.jdbc.Driver");

java.sql.Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/pro", "root", "peace");
java.sql.Statement stmt = con.createStatement();      
stmt.executeUpdate(query2I);
stmt.close();
con.close();

}
catch (Exception e)
{
JOptionPane.showMessageDialog(null,e);
}
 
new confirmPayment().setVisible(true);
 this.dispose();
   }

    }
    private void jLabel16MouseClicked(java.awt.event.MouseEvent evt) {
new welcome().setVisible(true);
 this.dispose();}

    public static void main(String args[]) {
      
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new PassengerDetails().setVisible(true);
}
        });
}
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Age;
    private javax.swing.JComboBox GA1;
    private javax.swing.JComboBox GA2;
    private javax.swing.JComboBox GA3;
    private javax.swing.JComboBox GA4;
    private javax.swing.JComboBox GA5;
    private javax.swing.JComboBox GC1;
    private javax.swing.JComboBox GC2;
    private javax.swing.JComboBox GC3;
    private javax.swing.JComboBox GI1;
    private javax.swing.JComboBox GI2;
    private javax.swing.JLabel Gender;
    private javax.swing.JLabel Mobile;
    private javax.swing.JTextField adult1;
    private javax.swing.JTextField adult2;
    private javax.swing.JTextField adult3;
    private javax.swing.JTextField adult4;
    private javax.swing.JTextField adult5;
    private javax.swing.JTextField ageA1;
    private javax.swing.JTextField ageA2;
    private javax.swing.JTextField ageA3;
    private javax.swing.JTextField ageA4;
    private javax.swing.JTextField ageA5;
    private javax.swing.JTextField ageC1;
    private javax.swing.JTextField ageC2;
    private javax.swing.JTextField ageC3;
    private javax.swing.JTextField ageI1;
    private javax.swing.JTextField ageI2;
    private javax.swing.JTextField child1;
    private javax.swing.JTextField child2;
    private javax.swing.JTextField child3;
    private javax.swing.JTextField infant1;
    private javax.swing.JTextField infant2;
    public static javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTextField txtPhone;
    // End of variables declaration//GEN-END:variables
}
