
package online.taxi.hiring.system;

import java.util.Vector;
import javax.swing.JComboBox;

/**
 *
 * @author : Hafizul Haque Shanto
 * Id   : 1504097
 * Dept : CSE
 * Sessional Group : B2
 */

class Randomizer{
    static int generate(int left, int right){
        return left + (int)(Math.random()*(right-left+1));
    }
}

class Taxi{
    int taxiNo;
    String currentLocation;
    String destination;
    int startingPos;
    int endingPos;
    int currentLocationId;
    int destinationId;
    int rentPerKilo;
    
    public Taxi(int taxiNo){
        this.taxiNo = taxiNo;
        this.currentLocationId = Randomizer.generate(1, 4);
        this.currentLocation = IdToString(currentLocationId);
        this.destination = "";
        this.destinationId = -1;
        this.rentPerKilo = Randomizer.generate(10, 15);
        this.startingPos = setPos(this.currentLocation);
        this.endingPos = -1;
    }
    
    public static int setPos(String str){
        if(str.equalsIgnoreCase("Chittagong"))
            return 0;
        else if(str.equalsIgnoreCase("Comilla"))
            return 240;
        else if(str.equalsIgnoreCase("Dhaka"))
            return 480;
        else if(str.equalsIgnoreCase("Rajshahi"))
            return 750;
        else{
            return -1;
        } 
    }
    
    public static int stringToId(String s){
        if(s.equalsIgnoreCase("Chittagong"))
            return 1;
        else if(s.equalsIgnoreCase("Comilla"))
            return 2;
        else if(s.equalsIgnoreCase("Dhaka"))
            return 3;
        else if(s.equalsIgnoreCase("Rajshahi"))
            return 4;
        else
            return -1;
    }
    
    public static String IdToString(int i){
        if(i==1)
            return "Chittagong";
        else if(i == 2)
            return "Comilla";
        else if(i == 3)
            return "Dhaka";
        else if(i == 4)
            return "Rajshahi";
        else
            return "";
    }
    
    public int getFair(){
        return rentPerKilo*(Math.abs(startingPos-endingPos));
    }
}

public class OnlineTaxiHiringSystem extends javax.swing.JFrame {
    static int carNumber = 20;
    Taxi[] car = new Taxi[carNumber];
    Vector elements;
    
    public OnlineTaxiHiringSystem() {
        initComponents();
        insidePane.setVisible(false);
        for(int i = 1; i <= carNumber; ++i){
            car[i-1] = new Taxi(1000+i);
        }
        elements = new Vector();
        jComboBox.setModel(new javax.swing.DefaultComboBoxModel(elements));
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        firstPane = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        secondPane = new javax.swing.JPanel();
        leftPane = new javax.swing.JPanel();
        currentLocationLabel = new javax.swing.JLabel();
        DestinationLocationLabel = new javax.swing.JLabel();
        searchButton = new javax.swing.JButton();
        taxiNoLabel = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        payableAmountLabel = new javax.swing.JLabel();
        availabilityCheckButton = new javax.swing.JButton();
        currentLocationTextField = new javax.swing.JTextField();
        destinationTextField = new javax.swing.JTextField();
        taxiNumberTextField = new javax.swing.JTextField();
        payAmountTextField = new javax.swing.JTextField();
        requestButton = new javax.swing.JButton();
        rightPane = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jComboBox = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        textPane = new javax.swing.JTextPane();
        thirdPane = new javax.swing.JPanel();
        infoLabel = new javax.swing.JLabel();
        fourthPane = new javax.swing.JPanel();
        insidePane = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jPasswordField1 = new javax.swing.JPasswordField();
        jPasswordField2 = new javax.swing.JPasswordField();
        confirmButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        firstPane.setBackground(new java.awt.Color(255, 0, 0));
        firstPane.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setLabelFor(firstPane);
        jLabel1.setText("New Era Taxi");

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("     Smartest Online Taxi Hiring System");

        javax.swing.GroupLayout firstPaneLayout = new javax.swing.GroupLayout(firstPane);
        firstPane.setLayout(firstPaneLayout);
        firstPaneLayout.setHorizontalGroup(
            firstPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, firstPaneLayout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        firstPaneLayout.setVerticalGroup(
            firstPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(firstPaneLayout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 16, Short.MAX_VALUE)
                .addContainerGap())
        );

        leftPane.setBackground(new java.awt.Color(255, 204, 51));

        currentLocationLabel.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        currentLocationLabel.setText("Enter Your Location                                               :");

        DestinationLocationLabel.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        DestinationLocationLabel.setText("Enter Your Destination                                         :");

        searchButton.setText("Search For Taxi");
        searchButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                searchButtonMouseClicked(evt);
            }
        });

        taxiNoLabel.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        taxiNoLabel.setText("Enter Taxi Number You Want To Hire               :");

        jLabel3.setText("(choose from the List in the Right Side)");

        jLabel4.setText("(& press request button to see Rent info)");

        payableAmountLabel.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        payableAmountLabel.setText("Enter Amount You Want To Pay                         :");

        availabilityCheckButton.setText("Check Availibility");
        availabilityCheckButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                availabilityCheckButtonMouseClicked(evt);
            }
        });

        requestButton.setText("Request");
        requestButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                requestButtonMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout leftPaneLayout = new javax.swing.GroupLayout(leftPane);
        leftPane.setLayout(leftPaneLayout);
        leftPaneLayout.setHorizontalGroup(
            leftPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(leftPaneLayout.createSequentialGroup()
                .addGroup(leftPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(leftPaneLayout.createSequentialGroup()
                        .addGap(90, 90, 90)
                        .addComponent(searchButton, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(leftPaneLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(leftPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(currentLocationLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 277, Short.MAX_VALUE)
                            .addComponent(DestinationLocationLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(taxiNoLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(payableAmountLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(leftPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(leftPaneLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(leftPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(currentLocationTextField)
                                    .addComponent(destinationTextField)
                                    .addComponent(taxiNumberTextField)
                                    .addComponent(payAmountTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 165, Short.MAX_VALUE)))
                            .addGroup(leftPaneLayout.createSequentialGroup()
                                .addGap(43, 43, 43)
                                .addComponent(requestButton))))
                    .addGroup(leftPaneLayout.createSequentialGroup()
                        .addGap(93, 93, 93)
                        .addComponent(availabilityCheckButton, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        leftPaneLayout.setVerticalGroup(
            leftPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(leftPaneLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(leftPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(currentLocationLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(currentLocationTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(leftPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(DestinationLocationLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(destinationTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(searchButton)
                .addGap(37, 37, 37)
                .addGroup(leftPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(leftPaneLayout.createSequentialGroup()
                        .addGroup(leftPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(taxiNoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(taxiNumberTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4))
                    .addComponent(requestButton))
                .addGap(32, 32, 32)
                .addGroup(leftPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(payableAmountLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(payAmountTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(availabilityCheckButton)
                .addContainerGap(12, Short.MAX_VALUE))
        );

        rightPane.setBackground(new java.awt.Color(51, 255, 102));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel5.setText("Available Taxi List   :");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel6.setText("Taxi Rent Info  :");

        jScrollPane2.setViewportView(textPane);

        javax.swing.GroupLayout rightPaneLayout = new javax.swing.GroupLayout(rightPane);
        rightPane.setLayout(rightPaneLayout);
        rightPaneLayout.setHorizontalGroup(
            rightPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(rightPaneLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(rightPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(rightPaneLayout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        rightPaneLayout.setVerticalGroup(
            rightPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(rightPaneLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(rightPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(115, 115, 115)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2)
                .addGap(15, 15, 15))
        );

        javax.swing.GroupLayout secondPaneLayout = new javax.swing.GroupLayout(secondPane);
        secondPane.setLayout(secondPaneLayout);
        secondPaneLayout.setHorizontalGroup(
            secondPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(secondPaneLayout.createSequentialGroup()
                .addComponent(leftPane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rightPane, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        secondPaneLayout.setVerticalGroup(
            secondPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(leftPane, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(rightPane, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        thirdPane.setBackground(new java.awt.Color(255, 204, 204));

        infoLabel.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        infoLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout thirdPaneLayout = new javax.swing.GroupLayout(thirdPane);
        thirdPane.setLayout(thirdPaneLayout);
        thirdPaneLayout.setHorizontalGroup(
            thirdPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(thirdPaneLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(infoLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18))
        );
        thirdPaneLayout.setVerticalGroup(
            thirdPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, thirdPaneLayout.createSequentialGroup()
                .addContainerGap(19, Short.MAX_VALUE)
                .addComponent(infoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );

        fourthPane.setBackground(new java.awt.Color(51, 102, 255));

        insidePane.setBackground(new java.awt.Color(0, 0, 255));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(204, 0, 0));
        jLabel7.setText("Credit Card No      :");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 0, 0));
        jLabel8.setText("Password              :");

        jPasswordField1.setText("jPasswordField1");

        jPasswordField2.setText("jPasswordField2");

        confirmButton.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        confirmButton.setText("Confirm");
        confirmButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                confirmButtonMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout insidePaneLayout = new javax.swing.GroupLayout(insidePane);
        insidePane.setLayout(insidePaneLayout);
        insidePaneLayout.setHorizontalGroup(
            insidePaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(insidePaneLayout.createSequentialGroup()
                .addGroup(insidePaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(insidePaneLayout.createSequentialGroup()
                        .addGap(241, 241, 241)
                        .addGroup(insidePaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, 128, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(insidePaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPasswordField1, javax.swing.GroupLayout.DEFAULT_SIZE, 148, Short.MAX_VALUE)
                            .addComponent(jPasswordField2)))
                    .addGroup(insidePaneLayout.createSequentialGroup()
                        .addGap(352, 352, 352)
                        .addComponent(confirmButton)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        insidePaneLayout.setVerticalGroup(
            insidePaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(insidePaneLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(insidePaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPasswordField1, javax.swing.GroupLayout.DEFAULT_SIZE, 24, Short.MAX_VALUE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(insidePaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPasswordField2, javax.swing.GroupLayout.DEFAULT_SIZE, 21, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                .addComponent(confirmButton))
        );

        javax.swing.GroupLayout fourthPaneLayout = new javax.swing.GroupLayout(fourthPane);
        fourthPane.setLayout(fourthPaneLayout);
        fourthPaneLayout.setHorizontalGroup(
            fourthPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, fourthPaneLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(insidePane, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        fourthPaneLayout.setVerticalGroup(
            fourthPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fourthPaneLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(insidePane, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(firstPane, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(secondPane, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(thirdPane, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(fourthPane, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(firstPane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(secondPane, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(thirdPane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(fourthPane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void searchButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchButtonMouseClicked

        String location = currentLocationTextField.getText().toString();
        elements.clear();;
        for(int i = 0; i < carNumber; ++i){
            if(location.equalsIgnoreCase(car[i].currentLocation)){
                elements.add(car[i].taxiNo);
            }
        }
        jComboBox.setModel(new javax.swing.DefaultComboBoxModel(elements));
    }//GEN-LAST:event_searchButtonMouseClicked

    private void requestButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_requestButtonMouseClicked
        int index = Integer.parseInt(taxiNumberTextField.getText().toString());
        index -= 1001;
        car[index].destination = destinationTextField.getText().toString();
        car[index].destinationId = Taxi.stringToId(car[index].destination);
        car[index].endingPos = Taxi.setPos(car[index].destination);
        setDetails(car[index]);
    }//GEN-LAST:event_requestButtonMouseClicked
    public void setDetails(Taxi t){
        String str = "Taxi no : " + t.taxiNo + "\n" +
                "Current Location :" + t.currentLocation + "\n" +
                "Destination :" + t.destination + "\n" +
                "Distance :" + Math.abs(t.endingPos-t.startingPos) + "kilo.\n" +
                "Rent Per Kilo :" + t.rentPerKilo + "tk\n" + 
                "Total fair : " + t.getFair() + "\n";
        
       textPane.setText(str);
    }
    
    private void availabilityCheckButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_availabilityCheckButtonMouseClicked
        int index = Integer.parseInt(taxiNumberTextField.getText().toString());
        index -= 1001;
        int minAmount = (int)(0.9*(car[index].getFair()));
        int payment = Integer.parseInt(payAmountTextField.getText().toString());
        String yesText = "Done. Make Your Payment Bellow to Confirm.";
        String noText = "Sorry! Not Enough. Increase Amount or Try another car";
        
        if(payment<minAmount){
            infoLabel.setText(noText);
        }
        else{
            infoLabel.setText(yesText);
            insidePane.setVisible(true);
        }
    }//GEN-LAST:event_availabilityCheckButtonMouseClicked

    private void confirmButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_confirmButtonMouseClicked
        dispose();
    }//GEN-LAST:event_confirmButtonMouseClicked

    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(OnlineTaxiHiringSystem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(OnlineTaxiHiringSystem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(OnlineTaxiHiringSystem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(OnlineTaxiHiringSystem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new OnlineTaxiHiringSystem().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel DestinationLocationLabel;
    private javax.swing.JButton availabilityCheckButton;
    private javax.swing.JButton confirmButton;
    private javax.swing.JLabel currentLocationLabel;
    private javax.swing.JTextField currentLocationTextField;
    private javax.swing.JTextField destinationTextField;
    private javax.swing.JPanel firstPane;
    private javax.swing.JPanel fourthPane;
    private javax.swing.JLabel infoLabel;
    private javax.swing.JPanel insidePane;
    private javax.swing.JComboBox<String> jComboBox;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JPasswordField jPasswordField2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JPanel leftPane;
    private javax.swing.JTextField payAmountTextField;
    private javax.swing.JLabel payableAmountLabel;
    private javax.swing.JButton requestButton;
    private javax.swing.JPanel rightPane;
    private javax.swing.JButton searchButton;
    private javax.swing.JPanel secondPane;
    private javax.swing.JLabel taxiNoLabel;
    private javax.swing.JTextField taxiNumberTextField;
    private javax.swing.JTextPane textPane;
    private javax.swing.JPanel thirdPane;
    // End of variables declaration//GEN-END:variables
}
