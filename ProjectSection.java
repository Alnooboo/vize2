/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.vize2;

import java.util.ArrayList;
import java.util.Dictionary;
import java.util.Hashtable;
import java.util.Random;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author habee
 */
public class ProjectSection extends javax.swing.JFrame {

    /**
     * Creates new form ProjectSection
     */
    public ProjectSection() {
        initComponents();
        // Set the table models for the products table
        ProductsTable1.setModel(ProductsTableModel);

        // Set the column headers for table model
        ProductsTableModel.setColumnIdentifiers(new String[]{"Name", "Description", "Price"});

        // Add products to products array
        products.AddProduct("cheese", "two bread, two piece of cheese, and tomato slice", 10);
        products.AddProduct("chocolate", "two bread, chocolate", 12);
        products.AddProduct("Orange juice", "Freshly squeezed orange juice", 3);
        products.AddProduct("Apple juice", "Freshly squeezed apple juice", 3.5);
        products.AddProduct("Chips", "A classic salty snack", 2);
        products.AddProduct("dark chocolate", "dark chocolate bar", 1.5);

        // Add the products to the table model
        for (int i = 0; i < products.ProductsLength(); i++) {
            ProductsTableModel.addRow(new String[]{
                products.getProducts().get(i).getName(),
                products.getProducts().get(i).getDescription(),
                products.getProducts().get(i).getPrice() + "",});

        }
    }

    //table models:
    DefaultTableModel ProductsTableModel = new DefaultTableModel();
    DefaultTableModel CartTableModel = new DefaultTableModel();
    DefaultTableModel OrdersTabelModel = new DefaultTableModel();

    //definig the products to the array
    Product products = new Product();
    Product cartProducts = new Product();
    Product recievedOrders = new Product();

    //selecteed products list
    ArrayList<Product> SelectedProducts = new ArrayList<>();

    //Orders list:
    //ArrayList<DefaultTableModel> OrdersListtabelModel = new ArrayList();

    DefaultTableModel[] OrdersListtabelModel = new DefaultTableModel[10];
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        HomePage = new javax.swing.JPanel();
        AdminLogIn1 = new javax.swing.JButton();
        GoToCart1 = new javax.swing.JButton();
        WelcomeMessage1 = new javax.swing.JLabel();
        DefinitionMessage = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        ProductsTable1 = new javax.swing.JTable();
        AddToCart = new javax.swing.JButton();
        GoToCart2 = new javax.swing.JButton();
        ShoppingCartPage = new javax.swing.JPanel();
        AdminLogIn2 = new javax.swing.JButton();
        GoToShop1 = new javax.swing.JButton();
        WelcomMessage2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        CartTable = new javax.swing.JTable();
        AddOne = new javax.swing.JButton();
        RemonveOne = new javax.swing.JButton();
        ConfirmTheOrder = new javax.swing.JButton();
        AdminLogInPage = new javax.swing.JPanel();
        GoToShop2 = new javax.swing.JButton();
        WelcomeMessage3 = new javax.swing.JLabel();
        UserNameLabel = new javax.swing.JLabel();
        Username = new javax.swing.JTextField();
        PasswordLabel = new javax.swing.JLabel();
        Password = new javax.swing.JTextField();
        LogIn = new javax.swing.JButton();
        MenuControlPage = new javax.swing.JPanel();
        GoToOrders = new javax.swing.JButton();
        GoToShop3 = new javax.swing.JButton();
        WelcomeMessage4 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        ProductsTable2 = new javax.swing.JTable();
        ChangeProdcut = new javax.swing.JLabel();
        ChangeName = new javax.swing.JButton();
        ChangeNameTextField = new javax.swing.JTextField();
        ChangePrice = new javax.swing.JButton();
        ChangePriceTaxtField = new javax.swing.JTextField();
        ChangeDescription = new javax.swing.JButton();
        ChangeDescriptionTextField = new javax.swing.JTextField();
        ProductNameTextField = new javax.swing.JTextField();
        ProductPriceTextField = new javax.swing.JTextField();
        ProductDescriptionTextField = new javax.swing.JTextField();
        DeleteProduct = new javax.swing.JLabel();
        DeleteSelectedProduct = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        ProductNameLabel = new javax.swing.JLabel();
        ProductPriceLabel = new javax.swing.JLabel();
        ProductDescriptionLabel = new javax.swing.JLabel();
        OrdersPage = new javax.swing.JPanel();
        GoToControl = new javax.swing.JButton();
        GoToShop4 = new javax.swing.JButton();
        WelcomeMessage5 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        OrdersList = new javax.swing.JList<>();
        ShowOrder = new javax.swing.JButton();
        jScrollPane5 = new javax.swing.JScrollPane();
        OrderTabel2 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        HomePage.setPreferredSize(new java.awt.Dimension(950, 500));

        AdminLogIn1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        AdminLogIn1.setText("Admin Log In");
        AdminLogIn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AdminLogIn1ActionPerformed(evt);
            }
        });

        GoToCart1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        GoToCart1.setText("Go To Cort");
        GoToCart1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GoToCart1ActionPerformed(evt);
            }
        });

        WelcomeMessage1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        WelcomeMessage1.setText("Welcome To FSM Canteen");

        DefinitionMessage.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        DefinitionMessage.setText("please choose your order:");

        ProductsTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(ProductsTable1);

        AddToCart.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        AddToCart.setText("Add To Cart");
        AddToCart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddToCartActionPerformed(evt);
            }
        });

        GoToCart2.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        GoToCart2.setText("Go To Cart");
        GoToCart2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GoToCart2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout HomePageLayout = new javax.swing.GroupLayout(HomePage);
        HomePage.setLayout(HomePageLayout);
        HomePageLayout.setHorizontalGroup(
            HomePageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HomePageLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(HomePageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(HomePageLayout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(DefinitionMessage)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(HomePageLayout.createSequentialGroup()
                        .addGroup(HomePageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, HomePageLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(GoToCart1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(AdminLogIn1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(HomePageLayout.createSequentialGroup()
                                .addComponent(WelcomeMessage1, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, HomePageLayout.createSequentialGroup()
                .addGroup(HomePageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(HomePageLayout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(AddToCart, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(HomePageLayout.createSequentialGroup()
                        .addContainerGap(222, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 505, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(44, 44, 44)
                .addComponent(GoToCart2, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(69, 69, 69))
        );
        HomePageLayout.setVerticalGroup(
            HomePageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HomePageLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(HomePageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AdminLogIn1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(GoToCart1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(WelcomeMessage1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(DefinitionMessage, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(63, 63, 63)
                .addGroup(HomePageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AddToCart, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(GoToCart2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(88, 88, 88))
        );

        jTabbedPane1.addTab("tab1", HomePage);

        ShoppingCartPage.setPreferredSize(new java.awt.Dimension(950, 500));

        AdminLogIn2.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        AdminLogIn2.setText("Admin Log In");
        AdminLogIn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AdminLogIn2ActionPerformed(evt);
            }
        });

        GoToShop1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        GoToShop1.setText("Back To Shop");
        GoToShop1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GoToShop1ActionPerformed(evt);
            }
        });

        WelcomMessage2.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        WelcomMessage2.setText("Shopping Cart:");

        CartTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(CartTable);

        AddOne.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        AddOne.setText("Add One");
        AddOne.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddOneActionPerformed(evt);
            }
        });

        RemonveOne.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        RemonveOne.setText("Remove one");
        RemonveOne.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RemonveOneActionPerformed(evt);
            }
        });

        ConfirmTheOrder.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        ConfirmTheOrder.setText("Confirm The Order");
        ConfirmTheOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConfirmTheOrderActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout ShoppingCartPageLayout = new javax.swing.GroupLayout(ShoppingCartPage);
        ShoppingCartPage.setLayout(ShoppingCartPageLayout);
        ShoppingCartPageLayout.setHorizontalGroup(
            ShoppingCartPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ShoppingCartPageLayout.createSequentialGroup()
                .addGroup(ShoppingCartPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ShoppingCartPageLayout.createSequentialGroup()
                        .addGroup(ShoppingCartPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(ShoppingCartPageLayout.createSequentialGroup()
                                .addGap(136, 136, 136)
                                .addComponent(RemonveOne, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(100, 100, 100)
                                .addComponent(AddOne, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(ShoppingCartPageLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(WelcomMessage2, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ShoppingCartPageLayout.createSequentialGroup()
                        .addGroup(ShoppingCartPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(ShoppingCartPageLayout.createSequentialGroup()
                                .addGap(57, 57, 57)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 151, Short.MAX_VALUE)
                                .addComponent(ConfirmTheOrder, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(ShoppingCartPageLayout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(GoToShop1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addComponent(AdminLogIn2, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        ShoppingCartPageLayout.setVerticalGroup(
            ShoppingCartPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ShoppingCartPageLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(ShoppingCartPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AdminLogIn2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(GoToShop1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(WelcomMessage2, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(ShoppingCartPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ShoppingCartPageLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(70, 70, 70))
                    .addGroup(ShoppingCartPageLayout.createSequentialGroup()
                        .addGap(77, 77, 77)
                        .addComponent(ConfirmTheOrder, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(ShoppingCartPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(RemonveOne, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AddOne, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(96, 96, 96))
        );

        jTabbedPane1.addTab("tab2", ShoppingCartPage);

        AdminLogInPage.setPreferredSize(new java.awt.Dimension(950, 500));

        GoToShop2.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        GoToShop2.setText("Back To Shop");
        GoToShop2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GoToShop2ActionPerformed(evt);
            }
        });

        WelcomeMessage3.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        WelcomeMessage3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        WelcomeMessage3.setText("Hello Admin!");

        UserNameLabel.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        UserNameLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        UserNameLabel.setText("Username");

        Username.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        PasswordLabel.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        PasswordLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        PasswordLabel.setText("Password");

        Password.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        LogIn.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        LogIn.setText("Log In");
        LogIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LogInActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout AdminLogInPageLayout = new javax.swing.GroupLayout(AdminLogInPage);
        AdminLogInPage.setLayout(AdminLogInPageLayout);
        AdminLogInPageLayout.setHorizontalGroup(
            AdminLogInPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AdminLogInPageLayout.createSequentialGroup()
                .addGroup(AdminLogInPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(AdminLogInPageLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(GoToShop2, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(AdminLogInPageLayout.createSequentialGroup()
                        .addGap(363, 363, 363)
                        .addGroup(AdminLogInPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, AdminLogInPageLayout.createSequentialGroup()
                                .addComponent(PasswordLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(Password, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(AdminLogInPageLayout.createSequentialGroup()
                                .addComponent(UserNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(Username, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, AdminLogInPageLayout.createSequentialGroup()
                                .addComponent(WelcomeMessage3, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(16, 16, 16)))
                        .addGap(0, 358, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, AdminLogInPageLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(LogIn, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(382, 382, 382))
        );
        AdminLogInPageLayout.setVerticalGroup(
            AdminLogInPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AdminLogInPageLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(GoToShop2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(72, 72, 72)
                .addComponent(WelcomeMessage3)
                .addGap(38, 38, 38)
                .addGroup(AdminLogInPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(UserNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Username, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(AdminLogInPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PasswordLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Password, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addComponent(LogIn)
                .addContainerGap(165, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("tab3", AdminLogInPage);

        MenuControlPage.setPreferredSize(new java.awt.Dimension(950, 500));

        GoToOrders.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        GoToOrders.setText("Look For Orders");
        GoToOrders.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GoToOrdersActionPerformed(evt);
            }
        });

        GoToShop3.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        GoToShop3.setText("Back To Shop");
        GoToShop3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GoToShop3ActionPerformed(evt);
            }
        });

        WelcomeMessage4.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        WelcomeMessage4.setText("Please Select Product To Edit:");

        ProductsTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane4.setViewportView(ProductsTable2);

        ChangeProdcut.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        ChangeProdcut.setText("Change Product");

        ChangeName.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        ChangeName.setText("Change Name");
        ChangeName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ChangeNameActionPerformed(evt);
            }
        });

        ChangeNameTextField.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        ChangePrice.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        ChangePrice.setText("Change Price");
        ChangePrice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ChangePriceActionPerformed(evt);
            }
        });

        ChangePriceTaxtField.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        ChangeDescription.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        ChangeDescription.setText("Change Description");
        ChangeDescription.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        ChangeDescription.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ChangeDescriptionActionPerformed(evt);
            }
        });

        ProductNameTextField.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        ProductPriceTextField.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        ProductDescriptionTextField.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        DeleteProduct.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        DeleteProduct.setText("Delete Product");

        DeleteSelectedProduct.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        DeleteSelectedProduct.setText("Delete Selected");
        DeleteSelectedProduct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteSelectedProductActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButton1.setText("Add Product");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        ProductNameLabel.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        ProductNameLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ProductNameLabel.setText("Name");

        ProductPriceLabel.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        ProductPriceLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ProductPriceLabel.setText("Price");

        ProductDescriptionLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ProductDescriptionLabel.setText("Description");

        javax.swing.GroupLayout MenuControlPageLayout = new javax.swing.GroupLayout(MenuControlPage);
        MenuControlPage.setLayout(MenuControlPageLayout);
        MenuControlPageLayout.setHorizontalGroup(
            MenuControlPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MenuControlPageLayout.createSequentialGroup()
                .addGroup(MenuControlPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(MenuControlPageLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(MenuControlPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(MenuControlPageLayout.createSequentialGroup()
                                .addComponent(WelcomeMessage4)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(MenuControlPageLayout.createSequentialGroup()
                                .addGroup(MenuControlPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(MenuControlPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(MenuControlPageLayout.createSequentialGroup()
                                            .addGroup(MenuControlPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(ChangeName, javax.swing.GroupLayout.DEFAULT_SIZE, 137, Short.MAX_VALUE)
                                                .addComponent(ChangePrice, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                            .addGroup(MenuControlPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(MenuControlPageLayout.createSequentialGroup()
                                                    .addGap(20, 20, 20)
                                                    .addComponent(ChangeNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGroup(MenuControlPageLayout.createSequentialGroup()
                                                    .addGap(18, 18, 18)
                                                    .addComponent(ChangePriceTaxtField, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                        .addGroup(MenuControlPageLayout.createSequentialGroup()
                                            .addComponent(ChangeDescription)
                                            .addGap(18, 18, 18)
                                            .addComponent(ChangeDescriptionTextField)))
                                    .addGroup(MenuControlPageLayout.createSequentialGroup()
                                        .addGap(89, 89, 89)
                                        .addComponent(ChangeProdcut, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 65, Short.MAX_VALUE)
                                .addGroup(MenuControlPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MenuControlPageLayout.createSequentialGroup()
                                        .addGroup(MenuControlPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(ProductDescriptionLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(ProductNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(ProductPriceLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(32, 32, 32)
                                        .addGroup(MenuControlPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(ProductPriceTextField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(ProductNameTextField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(ProductDescriptionTextField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(74, 74, 74))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MenuControlPageLayout.createSequentialGroup()
                                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(156, 156, 156)))
                                .addGroup(MenuControlPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MenuControlPageLayout.createSequentialGroup()
                                        .addComponent(DeleteSelectedProduct, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(90, 90, 90))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MenuControlPageLayout.createSequentialGroup()
                                        .addComponent(DeleteProduct, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(107, 107, 107))))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MenuControlPageLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(GoToShop3, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(GoToOrders, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addGroup(MenuControlPageLayout.createSequentialGroup()
                .addGap(172, 172, 172)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 600, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        MenuControlPageLayout.setVerticalGroup(
            MenuControlPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MenuControlPageLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(MenuControlPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(GoToOrders, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(GoToShop3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addComponent(WelcomeMessage4, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(MenuControlPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(MenuControlPageLayout.createSequentialGroup()
                        .addGroup(MenuControlPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ChangeProdcut)
                            .addComponent(DeleteProduct)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(MenuControlPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(MenuControlPageLayout.createSequentialGroup()
                                .addGap(23, 23, 23)
                                .addGroup(MenuControlPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(MenuControlPageLayout.createSequentialGroup()
                                        .addGroup(MenuControlPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(ChangeName, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(ChangeNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(13, 13, 13)
                                        .addComponent(ChangePrice, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(ChangeDescription, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(MenuControlPageLayout.createSequentialGroup()
                                        .addGap(31, 31, 31)
                                        .addComponent(ChangePriceTaxtField, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(25, 25, 25)
                                        .addComponent(ChangeDescriptionTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(MenuControlPageLayout.createSequentialGroup()
                                .addGap(38, 38, 38)
                                .addComponent(DeleteSelectedProduct, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(MenuControlPageLayout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addGroup(MenuControlPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ProductNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ProductNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(MenuControlPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ProductPriceTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ProductPriceLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(12, 12, 12)
                        .addGroup(MenuControlPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ProductDescriptionTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ProductDescriptionLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );

        jTabbedPane1.addTab("tab4", MenuControlPage);

        OrdersPage.setPreferredSize(new java.awt.Dimension(950, 500));

        GoToControl.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        GoToControl.setText("Back To Control List");

        GoToShop4.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        GoToShop4.setText("Back To Shop");

        WelcomeMessage5.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        WelcomeMessage5.setText("Check The Orders:");

        OrdersList.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        OrdersList.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane3.setViewportView(OrdersList);

        ShowOrder.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        ShowOrder.setText("Show Order");
        ShowOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ShowOrderActionPerformed(evt);
            }
        });

        OrderTabel2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane5.setViewportView(OrderTabel2);

        javax.swing.GroupLayout OrdersPageLayout = new javax.swing.GroupLayout(OrdersPage);
        OrdersPage.setLayout(OrdersPageLayout);
        OrdersPageLayout.setHorizontalGroup(
            OrdersPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(OrdersPageLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(GoToShop4, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(GoToControl, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(OrdersPageLayout.createSequentialGroup()
                .addGap(73, 73, 73)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 284, Short.MAX_VALUE)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49))
            .addGroup(OrdersPageLayout.createSequentialGroup()
                .addGroup(OrdersPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(OrdersPageLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(WelcomeMessage5, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(OrdersPageLayout.createSequentialGroup()
                        .addGap(396, 396, 396)
                        .addComponent(ShowOrder, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        OrdersPageLayout.setVerticalGroup(
            OrdersPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(OrdersPageLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(OrdersPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(GoToControl, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(GoToShop4, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(WelcomeMessage5, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51)
                .addGroup(OrdersPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 217, Short.MAX_VALUE))
                .addGap(33, 33, 33)
                .addComponent(ShowOrder, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(102, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("tab5", OrdersPage);

        getContentPane().add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -30, -1, 530));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //get random order number
    Random randomNumber = new Random();
    //orders dictionary
    Dictionary< String, DefaultTableModel> dict = new Hashtable<>();

    //get the total price:
    double totalPrice;

    AdminLogInIformation AdminInfo = new AdminLogInIformation();

    DefaultListModel<String> OrdersListnumber = new DefaultListModel();

    //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ Home Page ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    //Go To Admin Log In Page
    private void AdminLogIn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AdminLogIn1ActionPerformed
        //go to Admin Log In page
        jTabbedPane1.setSelectedIndex(2);
    }//GEN-LAST:event_AdminLogIn1ActionPerformed

    //Go To cart Page
    private void GoToCart1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GoToCart1ActionPerformed
        int selection = JOptionPane.showOptionDialog(this,//message place (middle)
                "you cant come back to choose other products", //the message
                "sure?", //message title
                JOptionPane.YES_NO_OPTION, //the options
                JOptionPane.YES_NO_OPTION, //message type
                null, //if you want to add icon
                new String[]{"yes", "no"}, //the options
                "yes");//highlited option
        if (selection == 0) {

            //go to cart page
            jTabbedPane1.setSelectedIndex(1);

            //defining table info
            CartTableModel.setColumnIdentifiers(new String[]{"Name", "Price", "quantity"});//cart table's headers
            CartTable.setModel(CartTableModel);//for cart table

            //definig the cart values
            for (int i = 0; i < SelectedProducts.size(); i++) {
                cartProducts.AddProduct(SelectedProducts.get(i).getName(),
                        SelectedProducts.get(i).getDescription(),
                        SelectedProducts.get(i).getPrice());

            }

            // Add the data to each table model
            for (int i = 0; i < SelectedProducts.size(); i++) {
                CartTableModel.addRow(new String[]{
                    cartProducts.getProducts().get(i).getName(),
                    cartProducts.getProducts().get(i).getPrice() + "",
                    cartProducts.getProducts().get(i).getQuantity() + ""
                });
            }
        }
    }//GEN-LAST:event_GoToCart1ActionPerformed

    //add product to the cart
    private void AddToCartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddToCartActionPerformed
        //to take the selected row
        int selectedRowInTabel = ProductsTable1.getSelectedRow();

        //if there is a row selected
        if (selectedRowInTabel != -1) {
            //get that row 
            Product selectedProduct = products.getProducts().get(selectedRowInTabel);

            //if it is inside the SelectedProducts array
            if (SelectedProducts.contains(selectedProduct)) {
                //show that the product already exists
                JOptionPane.showMessageDialog(null, "The product already exists in the cart.");
            } else {
                //add the product to the SelectedProducts array
                SelectedProducts.add(selectedProduct);
                //show the use a message
                JOptionPane.showMessageDialog(null, "Product added to cart: " + selectedProduct.getName());

            }
            // Clear the selection of the previous table
            ProductsTable1.clearSelection();
        } else {
            //show message that ask him to choose a product from the tabel first
            JOptionPane.showMessageDialog(null, "Please Select product from the table first");
        }
    }//GEN-LAST:event_AddToCartActionPerformed

    //Go To cart Page
    private void GoToCart2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GoToCart2ActionPerformed

        int selection = JOptionPane.showOptionDialog(this,//message place (middle)
                "you cant come back to choose other products", //the message
                "sure?", //message title
                JOptionPane.YES_NO_OPTION, //the options
                JOptionPane.YES_NO_OPTION, //message type
                null, //if you want to add icon
                new String[]{"yes", "no"}, //the options
                "yes");//highlited option
        if (selection == 0) {

            //go to cart page
            jTabbedPane1.setSelectedIndex(1);

            //defining table info
            CartTableModel.setColumnIdentifiers(new String[]{"Name", "Price", "quantity"});//cart table's headers
            CartTable.setModel(CartTableModel);//for cart table

            //definig the cart values
            for (int i = 0; i < SelectedProducts.size(); i++) {
                cartProducts.AddProduct(SelectedProducts.get(i).getName(),
                        SelectedProducts.get(i).getDescription(),
                        SelectedProducts.get(i).getPrice());

            }

            // Add the data to each table model
            for (int i = 0; i < SelectedProducts.size(); i++) {
                CartTableModel.addRow(new String[]{
                    cartProducts.getProducts().get(i).getName(),
                    cartProducts.getProducts().get(i).getPrice() + "",
                    cartProducts.getProducts().get(i).getQuantity() + ""
                });
            }
        }

    }//GEN-LAST:event_GoToCart2ActionPerformed

    //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ Cart Page ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    //Go To Admin Log In Page
    private void AdminLogIn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AdminLogIn2ActionPerformed
        //go to Admin Log In page
        jTabbedPane1.setSelectedIndex(2);
    }//GEN-LAST:event_AdminLogIn2ActionPerformed

    //Go To Shop page
    private void GoToShop1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GoToShop1ActionPerformed

        int selection = JOptionPane.showOptionDialog(this,//message place (middle)
                "you will lose your order", //the message
                "sure?", //message title
                JOptionPane.YES_NO_OPTION, //the options
                JOptionPane.YES_NO_OPTION, //message type
                null, //if you want to add icon
                new String[]{"yes", "no"}, //the options
                "yes");//highlited option
        if (selection == 0) {
            //go to Shop page
            jTabbedPane1.setSelectedIndex(0);

            int rowCount = CartTableModel.getRowCount();
            for (int i = rowCount - 1; i >= 0; i--) {
                CartTableModel.removeRow(i);
            }
            SelectedProducts.clear();
            cartProducts.RemoveAllProducts();
        }

    }//GEN-LAST:event_GoToShop1ActionPerformed

    //decrease product quantity
    private void RemonveOneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RemonveOneActionPerformed
        //select row
        int selectedRowInCart = CartTable.getSelectedRow();

        //select row from table
        if (selectedRowInCart != -1) {
            //product quantity bigger than 1
            if (cartProducts.getProducts().get(selectedRowInCart).getQuantity() > 1) {
                //decrease the ammount by one
                cartProducts.getProducts().get(selectedRowInCart).setQuantity(
                        cartProducts.getProducts().get(selectedRowInCart).getQuantity() - 1
                );

                cartProducts.getProducts().get(selectedRowInCart).setPrice(
                        cartProducts.getProducts().get(selectedRowInCart).getPrice()
                        - cartProducts.getProducts().get(selectedRowInCart).getOrginalPrice());

                CartTable.setValueAt(cartProducts.getProducts().get(selectedRowInCart).getQuantity(), selectedRowInCart, 2);
                CartTable.setValueAt(cartProducts.getProducts().get(selectedRowInCart).getPrice(), selectedRowInCart, 1);

                JOptionPane.showMessageDialog(null, "The product quantity and price has been decreased.");
            } else {
                int i = JOptionPane.showConfirmDialog(rootPane, "do you want to delete the product?");
                if (i == JOptionPane.YES_OPTION) {
                    CartTableModel.removeRow(selectedRowInCart);
                }
            }
        } else {
            JOptionPane.showMessageDialog(null, "Please Select product from the table first");
        }

    }//GEN-LAST:event_RemonveOneActionPerformed

    //increase product quantity
    private void AddOneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddOneActionPerformed

        int selectedRowInCart = CartTable.getSelectedRow();

        //select row from table
        if (selectedRowInCart != -1) {
            //increase the ammount by one

            cartProducts.getProducts().get(selectedRowInCart).setQuantity(
                    cartProducts.getProducts().get(selectedRowInCart).getQuantity() + 1
            );
            cartProducts.getProducts().get(selectedRowInCart).setPrice(
                    cartProducts.getProducts().get(selectedRowInCart).getPrice()
                    + cartProducts.getProducts().get(selectedRowInCart).getOrginalPrice());
            CartTable.setValueAt(cartProducts.getProducts().get(selectedRowInCart).getQuantity(), selectedRowInCart, 2);
            CartTable.setValueAt(cartProducts.getProducts().get(selectedRowInCart).getPrice(), selectedRowInCart, 1);
            JOptionPane.showMessageDialog(null, "The product quantity and price has been increased.");
        } else {
            JOptionPane.showMessageDialog(null, "Please Select product from the table first");
        }
    }//GEN-LAST:event_AddOneActionPerformed

    //confirm the order
    private void ConfirmTheOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConfirmTheOrderActionPerformed

        //set the total to 0
        double totalPrice = 0;

        //to get the total price
        for (int i = 0; i < SelectedProducts.size(); i++) {
            totalPrice += cartProducts.getProducts().get(i).getPrice();
        }

        //to confirm the order
        int selection = JOptionPane.showOptionDialog(this,//message place (middle)
                "your total price is: " + totalPrice, //the message
                "confirm", //message title
                JOptionPane.YES_NO_OPTION, //the options
                JOptionPane.YES_NO_OPTION, //message type
                null, //if you want to add icon
                new String[]{"yes", "no"}, //the options
                "yes");//highlited option

        //if yes:
        if (selection == 0) {
            //get the order number
            int orderNumber = randomNumber.nextInt(1000);
            //to open the orders list tabel model
            for (int i = 0; i <= OrdersListtabelModel.length; i++) {
                if (OrdersListtabelModel[i]==null) {
                    //add the order to the orders list
                    
                OrdersListtabelModel[i]= CartTableModel;
                //link the order number to the order
                dict.put(orderNumber + "", OrdersListtabelModel[i]);
                //give the order number information
                JOptionPane.showMessageDialog(null, "your order number: " + orderNumber,
                        "thanks for your order", JOptionPane.ERROR_MESSAGE);
                OrdersListnumber.addElement(orderNumber + "");
                break;
                }else if(i == OrdersListtabelModel.length){
                    JOptionPane.showMessageDialog(null, "we got too many orders please wait we will get your order as soon as possible",
                        "we are so sorry", JOptionPane.ERROR_MESSAGE);
                }
                

            }
            //empty the order tabel, seleceted product and the cart products
            int rowCount = CartTableModel.getRowCount();
            for (int i = rowCount - 1; i >= 0; i--) {
                CartTableModel.removeRow(i);
            }
            SelectedProducts.clear();
            cartProducts.RemoveAllProducts();

        }

    }//GEN-LAST:event_ConfirmTheOrderActionPerformed

    //~~~~~~~~~~~~~~~~~~~~~~~~~ Admin Log In page ~~~~~~~~~~~~~~~~~~~~~~~~~
    //Go To Shop page
    private void GoToShop2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GoToShop2ActionPerformed
        //go to Shop page
        jTabbedPane1.setSelectedIndex(0);
    }//GEN-LAST:event_GoToShop2ActionPerformed

    //Log In to admin page
    private void LogInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogInActionPerformed
        if (AdminInfo.getUsername().equals(Username.getText()) && AdminInfo.getPassword().equals(Password.getText())) {
            JOptionPane.showMessageDialog(null, "Hello Admin!");
            jTabbedPane1.setSelectedIndex(3);
            // Set the table models for the products table
            ProductsTable2.setModel(ProductsTableModel);
        } else {
            JOptionPane.showMessageDialog(null, "The Username or The Password is incorrect!");
        }
    }//GEN-LAST:event_LogInActionPerformed

    //~~~~~~~~~~~~~~~~~~~~~~~~~ Menu Control Page ~~~~~~~~~~~~~~~~~~~~~~~~~
    //Go to orders
    private void GoToOrdersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GoToOrdersActionPerformed
        jTabbedPane1.setSelectedIndex(4);
        OrdersList.setModel(OrdersListnumber);
    }//GEN-LAST:event_GoToOrdersActionPerformed

    //Go To Shop page
    private void GoToShop3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GoToShop3ActionPerformed
        //go to Shop page
        jTabbedPane1.setSelectedIndex(0);
    }//GEN-LAST:event_GoToShop3ActionPerformed

    //Change product name:
    private void ChangeNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ChangeNameActionPerformed
        //to take the selected row
        int selectedRowInTable = ProductsTable2.getSelectedRow();

        if (selectedRowInTable != -1) {
            products.getProducts().get(selectedRowInTable).setName(ChangeNameTextField.getText());
            JOptionPane.showMessageDialog(null, "Product name has been updated");
            ProductsTable2.setValueAt(products.getProducts().get(selectedRowInTable).getName(), selectedRowInTable, 0);
            ProductsTable1.setValueAt(products.getProducts().get(selectedRowInTable).getName(), selectedRowInTable, 0);
        } else {
            //show message that ask him to choose a product from the tabel first
            JOptionPane.showMessageDialog(null, "Please Select product from the table first");
        }

    }//GEN-LAST:event_ChangeNameActionPerformed

    //Change product price:
    private void ChangePriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ChangePriceActionPerformed
        //to take the selected row
        int selectedRowInTable = ProductsTable2.getSelectedRow();

        if (selectedRowInTable != -1) {
            if (!ChangePriceTaxtField.getText().matches("[0-9]+(\\.[0-9]+)?")) {
                JOptionPane.showMessageDialog(null, "You can't add letters to the Price!");
            } else {
                products.getProducts().get(selectedRowInTable).setPrice(Double.parseDouble(ChangePriceTaxtField.getText()));
                JOptionPane.showMessageDialog(null, "Product Price has been updated");

                //show the updated price on the tabels
                ProductsTable2.setValueAt(products.getProducts().get(selectedRowInTable).getPrice(), selectedRowInTable, 2);
                ProductsTable1.setValueAt(products.getProducts().get(selectedRowInTable).getPrice(), selectedRowInTable, 2);
            }

        } else {
            //show message that ask him to choose a product from the tabel first
            JOptionPane.showMessageDialog(null, "Please Select product from the table first");
        }
    }//GEN-LAST:event_ChangePriceActionPerformed

    //Change product description:
    private void ChangeDescriptionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ChangeDescriptionActionPerformed
        //to take the selected row
        int selectedRowInTable = ProductsTable2.getSelectedRow();

        if (selectedRowInTable != -1) {
            products.getProducts().get(selectedRowInTable).setDescription(ChangeNameTextField.getText());
            JOptionPane.showMessageDialog(null, "Product description has been updated");
            ProductsTable2.setValueAt(products.getProducts().get(selectedRowInTable).getDescription(), selectedRowInTable, 1);
            ProductsTable1.setValueAt(products.getProducts().get(selectedRowInTable).getDescription(), selectedRowInTable, 1);
        } else {
            //show message that ask him to choose a product from the tabel first
            JOptionPane.showMessageDialog(null, "Please Select product from the table first");
        }
    }//GEN-LAST:event_ChangeDescriptionActionPerformed

    //add new product:
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if (!ProductPriceTextField.getText().matches("[0-9]+(\\.[0-9]+)?")) {
            JOptionPane.showMessageDialog(null, "You can't add charecters to the Price!");
        } else {
            products.AddProduct(ProductNameTextField.getText(),
                    ProductDescriptionTextField.getText(),
                    Double.parseDouble(ProductPriceTextField.getText()));

            // Add the products to the table model
            for (int i = 0; i < products.ProductsLength(); i++) {
                if (products.getProducts().get(i).getName().equals(ProductNameTextField.getText())) {
                    ProductsTableModel.addRow(new String[]{
                        products.getProducts().get(i).getName(),
                        products.getProducts().get(i).getDescription(),
                        products.getProducts().get(i).getPrice() + "",});

                }
            }
            JOptionPane.showMessageDialog(null, "the product has been added");

        }

    }//GEN-LAST:event_jButton1ActionPerformed

    //delete a product from the tabel
    private void DeleteSelectedProductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteSelectedProductActionPerformed
        //to take the selected row
        int selectedRowInTable = ProductsTable2.getSelectedRow();
        if (selectedRowInTable != -1) {
            //remove from products array
            for (int i = 0; i < products.ProductsLength(); i++) {
                if (products.getProducts().get(i).getName().equals(ProductsTableModel.getValueAt(selectedRowInTable, 0))) {
                    products.removeproduct(i);
                }
            }

            //remove from the table
            ProductsTableModel.removeRow(selectedRowInTable);

            JOptionPane.showMessageDialog(null, "the product has been deleted");
        } else {
            JOptionPane.showMessageDialog(null, "please select order to delete");
        }


    }//GEN-LAST:event_DeleteSelectedProductActionPerformed

    //~~~~~~~~~~~~~~~~~~~~~~~~~ Orders page ~~~~~~~~~~~~~~~~~~~~~~~~~
    
    //show order
    private void ShowOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ShowOrderActionPerformed
        //dict.get(OrdersList.getSelectedValue());
        OrderTabel2.setModel(dict.get(OrdersList.getSelectedValue()));
/*
        OrdersTabelModel.setColumnIdentifiers(new String[]{"Name", "quantity"});

        //definig the cart values
        for (int i = 0; i < dict.get(OrdersList.getSelectedValue()).size(); i++) {
            recievedOrders.AddProduct(dict.get(OrdersList.getSelectedValue()).get(i).getName(),
                    dict.get(OrdersList.getSelectedValue()).get(i).getQuantity());
        }

        for (int i = 0; i < dict.get(OrdersList.getSelectedValue()).size(); i++) {
            OrdersTabelModel.addRow(new String[]{
                recievedOrders.getProducts().get(i).getName(),
                cartProducts.getProducts().get(i).getQuantity() + ""
            });
        }

*/
    }//GEN-LAST:event_ShowOrderActionPerformed

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
            java.util.logging.Logger.getLogger(ProjectSection.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ProjectSection.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ProjectSection.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ProjectSection.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ProjectSection().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddOne;
    private javax.swing.JButton AddToCart;
    private javax.swing.JButton AdminLogIn1;
    private javax.swing.JButton AdminLogIn2;
    private javax.swing.JPanel AdminLogInPage;
    private javax.swing.JTable CartTable;
    private javax.swing.JButton ChangeDescription;
    private javax.swing.JTextField ChangeDescriptionTextField;
    private javax.swing.JButton ChangeName;
    private javax.swing.JTextField ChangeNameTextField;
    private javax.swing.JButton ChangePrice;
    private javax.swing.JTextField ChangePriceTaxtField;
    private javax.swing.JLabel ChangeProdcut;
    private javax.swing.JButton ConfirmTheOrder;
    private javax.swing.JLabel DefinitionMessage;
    private javax.swing.JLabel DeleteProduct;
    private javax.swing.JButton DeleteSelectedProduct;
    private javax.swing.JButton GoToCart1;
    private javax.swing.JButton GoToCart2;
    private javax.swing.JButton GoToControl;
    private javax.swing.JButton GoToOrders;
    private javax.swing.JButton GoToShop1;
    private javax.swing.JButton GoToShop2;
    private javax.swing.JButton GoToShop3;
    private javax.swing.JButton GoToShop4;
    private javax.swing.JPanel HomePage;
    private javax.swing.JButton LogIn;
    private javax.swing.JPanel MenuControlPage;
    private javax.swing.JTable OrderTabel2;
    private javax.swing.JList<String> OrdersList;
    private javax.swing.JPanel OrdersPage;
    private javax.swing.JTextField Password;
    private javax.swing.JLabel PasswordLabel;
    private javax.swing.JLabel ProductDescriptionLabel;
    private javax.swing.JTextField ProductDescriptionTextField;
    private javax.swing.JLabel ProductNameLabel;
    private javax.swing.JTextField ProductNameTextField;
    private javax.swing.JLabel ProductPriceLabel;
    private javax.swing.JTextField ProductPriceTextField;
    private javax.swing.JTable ProductsTable1;
    private javax.swing.JTable ProductsTable2;
    private javax.swing.JButton RemonveOne;
    private javax.swing.JPanel ShoppingCartPage;
    private javax.swing.JButton ShowOrder;
    private javax.swing.JLabel UserNameLabel;
    private javax.swing.JTextField Username;
    private javax.swing.JLabel WelcomMessage2;
    private javax.swing.JLabel WelcomeMessage1;
    private javax.swing.JLabel WelcomeMessage3;
    private javax.swing.JLabel WelcomeMessage4;
    private javax.swing.JLabel WelcomeMessage5;
    private javax.swing.JButton jButton1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTabbedPane jTabbedPane1;
    // End of variables declaration//GEN-END:variables
}
