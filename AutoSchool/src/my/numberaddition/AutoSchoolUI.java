/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package my.numberaddition;

import java.io.*;
import java.util.*;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;

/**
 *
 * @author Елена
 */
public class AutoSchoolUI extends javax.swing.JFrame {

    /**
     * Creates new form AutoSchoolUI
     */
    public AutoSchoolUI() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        MainMenu = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        SurnameInstruktor = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();
        jTextField15 = new javax.swing.JTextField();
        Student = new javax.swing.JTabbedPane();
        StudentReserv = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jButton3 = new javax.swing.JButton();
        jLabel17 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        Instruktor = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTable4 = new javax.swing.JTable();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        IdentInstruktor = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new java.awt.CardLayout());

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel9.setText("Войти как");

        jButton6.setText("Ученик");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton7.setText("Инструктор");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout MainMenuLayout = new javax.swing.GroupLayout(MainMenu);
        MainMenu.setLayout(MainMenuLayout);
        MainMenuLayout.setHorizontalGroup(
            MainMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MainMenuLayout.createSequentialGroup()
                .addGap(298, 298, 298)
                .addGroup(MainMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(MainMenuLayout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(jLabel9))
                    .addGroup(MainMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jButton7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(310, Short.MAX_VALUE))
        );
        MainMenuLayout.setVerticalGroup(
            MainMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MainMenuLayout.createSequentialGroup()
                .addGap(113, 113, 113)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(160, Short.MAX_VALUE))
        );

        getContentPane().add(MainMenu, "card2");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel6.setText("Введите фамилию инструктора");

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jButton1.setText("ОК");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel16.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel16.setText("Введите вашу фамилию");

        jTextField15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField15ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout SurnameInstruktorLayout = new javax.swing.GroupLayout(SurnameInstruktor);
        SurnameInstruktor.setLayout(SurnameInstruktorLayout);
        SurnameInstruktorLayout.setHorizontalGroup(
            SurnameInstruktorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SurnameInstruktorLayout.createSequentialGroup()
                .addGap(118, 118, 118)
                .addGroup(SurnameInstruktorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(SurnameInstruktorLayout.createSequentialGroup()
                        .addGroup(SurnameInstruktorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel16)
                            .addComponent(jLabel6))
                        .addGap(39, 39, 39)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(SurnameInstruktorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(SurnameInstruktorLayout.createSequentialGroup()
                            .addGap(207, 207, 207)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(SurnameInstruktorLayout.createSequentialGroup()
                            .addGap(294, 294, 294)
                            .addComponent(jTextField15, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(191, Short.MAX_VALUE))
        );
        SurnameInstruktorLayout.setVerticalGroup(
            SurnameInstruktorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SurnameInstruktorLayout.createSequentialGroup()
                .addGap(116, 116, 116)
                .addGroup(SurnameInstruktorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(50, 50, 50)
                .addGroup(SurnameInstruktorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(jTextField15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addComponent(jButton1)
                .addContainerGap(122, Short.MAX_VALUE))
        );

        getContentPane().add(SurnameInstruktor, "card4");

        jTable2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jTable2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Понедельник", "Вторник", "Среда", "Четверг", "Пятница", "Суббота"
            }
        ));
        jTable2.setColumnSelectionAllowed(true);
        jTable2.setRowHeight(23);
        jScrollPane2.setViewportView(jTable2);
        jTable2.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);

        jButton3.setText("Записаться");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel17.setText("Выберите занятие");

        jLabel1.setText("7:30 - 9:00");

        jLabel2.setText("9:00 - 10:30");

        jLabel3.setText("10:30 - 12:00");

        jLabel4.setText("12:30 - 14:00");

        jLabel5.setText("14:00 - 15:30");

        jLabel7.setText("15:30 - 17:00");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel8.setText("Записаться на занятие");

        javax.swing.GroupLayout StudentReservLayout = new javax.swing.GroupLayout(StudentReserv);
        StudentReserv.setLayout(StudentReservLayout);
        StudentReservLayout.setHorizontalGroup(
            StudentReservLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, StudentReservLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(StudentReservLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(StudentReservLayout.createSequentialGroup()
                        .addGroup(StudentReservLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel7))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 657, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, StudentReservLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton3)
                .addGap(335, 335, 335))
            .addGroup(StudentReservLayout.createSequentialGroup()
                .addGroup(StudentReservLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(StudentReservLayout.createSequentialGroup()
                        .addGap(286, 286, 286)
                        .addComponent(jLabel8))
                    .addGroup(StudentReservLayout.createSequentialGroup()
                        .addGap(336, 336, 336)
                        .addComponent(jLabel17)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        StudentReservLayout.setVerticalGroup(
            StudentReservLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(StudentReservLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 90, Short.MAX_VALUE)
                .addComponent(jLabel17)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton3)
                .addGap(29, 29, 29))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, StudentReservLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addGap(88, 88, 88))
        );

        Student.addTab("Записаться на занятие", StudentReserv);

        jTable3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jTable3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Понедельник", "Вторник", "Среда", "Четверг", "Пятница", "Суббота"
            }
        ));
        jTable3.setRowHeight(23);
        jScrollPane3.setViewportView(jTable3);
        jTable3.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);

        jLabel21.setText("7:30 - 9:00");

        jLabel22.setText("9:00 - 10:30");

        jLabel23.setText("10:30 - 12:00");

        jLabel24.setText("12:30 - 14:00");

        jLabel25.setText("14:00 - 15:30");

        jLabel26.setText("15:30 - 17:00");

        jButton5.setText("Отменить занятие");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel21, javax.swing.GroupLayout.DEFAULT_SIZE, 78, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel22)
                            .addComponent(jLabel23)
                            .addComponent(jLabel24)
                            .addComponent(jLabel25)
                            .addComponent(jLabel26))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 657, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(342, 342, 342)
                .addComponent(jButton5)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(88, 88, 88)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(118, 118, 118)
                        .addComponent(jLabel21)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel22)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel23)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel24)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel25)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel26)))
                .addGap(30, 30, 30)
                .addComponent(jButton5)
                .addContainerGap(96, Short.MAX_VALUE))
        );

        Student.addTab("Мое расписание", jPanel1);

        getContentPane().add(Student, "card5");

        jTable4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jTable4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTable4.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Понедельник", "Вторник", "Среда", "Четверг", "Пятница", "Суббота"
            }
        ));
        jTable4.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jTable4.setRowHeight(23);
        jTable4.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jTable4.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane4.setViewportView(jTable4);
        jTable4.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);

        jLabel11.setText("7:30 - 9:00");

        jLabel12.setText("9:00 - 10:30");

        jLabel13.setText("10:30 - 12:00");

        jLabel14.setText("12:30 - 14:00");

        jLabel15.setText("14:00 - 15:30");

        jLabel18.setText("15:30 - 17:00");

        jLabel20.setText("Выберите время для добавления занятия");

        jButton4.setText("Добавить занятие");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout InstruktorLayout = new javax.swing.GroupLayout(Instruktor);
        Instruktor.setLayout(InstruktorLayout);
        InstruktorLayout.setHorizontalGroup(
            InstruktorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, InstruktorLayout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addGroup(InstruktorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel12)
                    .addComponent(jLabel13)
                    .addComponent(jLabel14)
                    .addComponent(jLabel15)
                    .addComponent(jLabel18))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 657, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(56, 56, 56))
            .addGroup(InstruktorLayout.createSequentialGroup()
                .addGroup(InstruktorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(InstruktorLayout.createSequentialGroup()
                        .addGap(389, 389, 389)
                        .addComponent(jLabel19))
                    .addGroup(InstruktorLayout.createSequentialGroup()
                        .addGap(305, 305, 305)
                        .addComponent(jLabel20))
                    .addGroup(InstruktorLayout.createSequentialGroup()
                        .addGap(343, 343, 343)
                        .addComponent(jButton4)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        InstruktorLayout.setVerticalGroup(
            InstruktorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(InstruktorLayout.createSequentialGroup()
                .addGroup(InstruktorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(InstruktorLayout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addComponent(jLabel20)
                        .addGap(31, 31, 31)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(InstruktorLayout.createSequentialGroup()
                        .addGap(127, 127, 127)
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel14)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel15)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel18)))
                .addGap(18, 18, 18)
                .addComponent(jLabel19)
                .addGap(18, 18, 18)
                .addComponent(jButton4)
                .addContainerGap(108, Short.MAX_VALUE))
        );

        getContentPane().add(Instruktor, "card5");

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel10.setText("Введите вашу фамилию");

        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });

        jButton2.setText("ОК");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout IdentInstruktorLayout = new javax.swing.GroupLayout(IdentInstruktor);
        IdentInstruktor.setLayout(IdentInstruktorLayout);
        IdentInstruktorLayout.setHorizontalGroup(
            IdentInstruktorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(IdentInstruktorLayout.createSequentialGroup()
                .addGroup(IdentInstruktorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(IdentInstruktorLayout.createSequentialGroup()
                        .addGap(101, 101, 101)
                        .addComponent(jLabel10)
                        .addGap(18, 18, 18)
                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(IdentInstruktorLayout.createSequentialGroup()
                        .addGap(259, 259, 259)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(184, Short.MAX_VALUE))
        );
        IdentInstruktorLayout.setVerticalGroup(
            IdentInstruktorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(IdentInstruktorLayout.createSequentialGroup()
                .addGap(102, 102, 102)
                .addGroup(IdentInstruktorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(86, 86, 86)
                .addComponent(jButton2)
                .addContainerGap(131, Short.MAX_VALUE))
        );

        getContentPane().add(IdentInstruktor, "card6");

        pack();
    }// </editor-fold>//GEN-END:initComponents
String myInstruktor;
    String mySurname;

    public static int ParsTime(String filenamestr) {
        int timeInt = -1;
        if (filenamestr.equals("7:30-9:00")) {
            timeInt = 0;
        }
        if (filenamestr.equals("9:00-10:30")) {
            timeInt = 1;
        }
        if (filenamestr.equals("10:30-12:00")) {
            timeInt = 2;
        }
        if (filenamestr.equals("12:30-14:00")) {
            timeInt = 3;
        }
        if (filenamestr.equals("14:00-15:30")) {
            timeInt = 4;
        }
        if (filenamestr.equals("15:30-17:00")) {
            timeInt = 5;
        }
        return timeInt;
    }

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        MainMenu.setVisible(false);
        SurnameInstruktor.setVisible(true);
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        MainMenu.setVisible(false);
        IdentInstruktor.setVisible(true);
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
//запрос на запись
        int row = jTable2.getSelectedRow();
        int column = jTable2.getSelectedColumn();
        String day;
        int strNumber = -1;
        int strNumberSelect = 0;
        DefaultTableModel tblModel = (DefaultTableModel) jTable2.getModel();
        File sourceFile = new File("C:\\Users\\Елена\\Documents\\NetBeansProjects\\AutoSchool\\src\\TimeTable.txt");

        try (FileReader readFile = new FileReader(sourceFile)) {
            String buf;
            BufferedReader reader = new BufferedReader(readFile);
            while ((buf = reader.readLine()) != null) {
                strNumber++;
                String[] v = buf.split(" ");
                if ((v[0].equals(myInstruktor)) && (v[3].equals("свободно"))) {
                    int timeInt = 0;
                    timeInt = ParsTime(v[1]);
                    day = v[2];
                    int dayInt = 0;
                    dayInt = Integer.parseInt(day);

                    if ((row == timeInt) && (column == dayInt)) {
                        tblModel.setValueAt(" ", row, column);
                        strNumberSelect = strNumber;
                    }
                }

            }
            Client client = new Client();

            client.client(strNumberSelect, mySurname, ".", "C:\\Users\\Елена\\Documents\\NetBeansProjects\\AutoSchool\\src\\TimeTable.txt");

        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }

    }//GEN-LAST:event_jButton3ActionPerformed

    private void jTextField15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField15ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField15ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        myInstruktor = jTextField1.getText();
        mySurname = jTextField15.getText();
        if (mySurname.equals("")) {
            JOptionPane.showMessageDialog(null,
                    "Введите свою фамилию",
                    "Ошибка",
                    JOptionPane.INFORMATION_MESSAGE);
        }

        new Thread(new Runnable() {
            public void run() {
                while (true) { //бесконечно крутим
                    try {
                         
                        String day;
                        int i = 0;
                        DefaultTableModel tblModel = (DefaultTableModel) jTable2.getModel();
                        DefaultTableModel studenttblModel = (DefaultTableModel) jTable3.getModel();
                        tblModel.setRowCount(6);
                        studenttblModel.setRowCount(6);
                        try (FileReader readFile = new FileReader("C:\\Users\\Елена\\Documents\\NetBeansProjects\\AutoSchool\\src\\TimeTable.txt")) {
                            String buf;
                            BufferedReader rBuf = new BufferedReader(readFile);
                            while ((buf = rBuf.readLine()) != null) {

                                int timeInt = 0;
                                int dayInt = 0;
                                String[] v = buf.split(" ");
                                timeInt = ParsTime(v[1]);
                                day = v[2];
                                dayInt = Integer.parseInt(day);
                                if ((v[0].equals(myInstruktor)) && (v[3].equals("свободно"))) {
                                    i = 1;

                                    tblModel.setValueAt("Свободно", timeInt, dayInt);
                                }
                                if (v[3].equals(mySurname)) {
                                    studenttblModel.setValueAt("          V          ", timeInt, dayInt);
                                }
                            }
                            if (i != 0) {
                                SurnameInstruktor.setVisible(false);
                                Student.setVisible(true);
                            } else {
                                JOptionPane.showMessageDialog(null,
                                        "Инструктор с такой Фамилией не найден",
                                        "Ошибка",
                                        JOptionPane.INFORMATION_MESSAGE);
                            }
                        } catch (IOException e) {
                            JOptionPane.showMessageDialog(null, e.getMessage());
                        }
                    Thread.sleep(10000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }).start();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
//вход в аккаунт инструктора
        myInstruktor = jTextField2.getText();
        if (myInstruktor.equals("")) {
            JOptionPane.showMessageDialog(null,
                    "Введите свою фамилию",
                    "Ошибка",
                    JOptionPane.INFORMATION_MESSAGE);
        }
        new Thread(new Runnable() {
            public void run() {
                while (true) { //бесконечно крутим
                    try {

                        String day;

                        DefaultTableModel insttblModel = (DefaultTableModel) jTable4.getModel();
                        insttblModel.setRowCount(6);
                        try (FileReader readFile = new FileReader("C:\\Users\\Елена\\Documents\\NetBeansProjects\\AutoSchool\\src\\TimeTable.txt")) {
                            String buf;
                            BufferedReader rBuf = new BufferedReader(readFile);
                            while ((buf = rBuf.readLine()) != null) {

                                int timeInt = 0;
                                int dayInt = 0;
                                String[] v = buf.split(" ");
                                if (v[0].equals(myInstruktor)) {
                                    timeInt = ParsTime(v[1]);
                                    day = v[2];
                                    dayInt = Integer.parseInt(day);
                                    insttblModel.setValueAt(v[3], timeInt, dayInt);
                                }

                            }
                        } catch (IOException e) {
                            JOptionPane.showMessageDialog(null, e.getMessage());
                        }

                        Thread.sleep(10000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }).start();

        IdentInstruktor.setVisible(false);
        Instruktor.setVisible(true);

    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        //кнопка добавить занятие инструктора
        DefaultTableModel insttblModel = (DefaultTableModel) jTable4.getModel();
        int row = jTable4.getSelectedRow();
        int column = jTable4.getSelectedColumn();
        insttblModel.setValueAt("свободно", row, column);
        String time = null;
        String info;
        File sourceFile = new File("C:\\Users\\Елена\\Documents\\NetBeansProjects\\AutoSchool\\src\\TimeTable.txt");
        if (row == 0) {
            time = "7:30-9:00";
        }
        if (row == 1) {
            time = "9:00-10:30";
        }
        if (row == 2) {
            time = "10:30-12:00";
        }
        if (row == 3) {
            time = "12:30-14:00";
        }
        if (row == 4) {
            time = "14:00-15:30";
        }
        if (row == 5) {
            time = "15:30-17:00";
        }
        info =  myInstruktor + " " + time + " " + column + " свободно";

        try (FileWriter output = new FileWriter("C:\\Users\\Елена\\Documents\\NetBeansProjects\\AutoSchool\\src\\TimeTable.txt", true)) {
            output.append("\n");
            output.append(info);
            output.close();

        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        //запрос на удаление занятия
        int row = jTable3.getSelectedRow();
        int column = jTable3.getSelectedColumn();
        String day;
        int strNumber = -1;
        int strNumberSelect = 0;
        DefaultTableModel tblModel = (DefaultTableModel) jTable3.getModel();
        File sourceFile = new File("C:\\Users\\Елена\\Documents\\NetBeansProjects\\AutoSchool\\src\\TimeTable.txt");

        try (FileReader readFile = new FileReader(sourceFile)) {
            String buf;
            BufferedReader reader = new BufferedReader(readFile);
            while ((buf = reader.readLine()) != null) {
                strNumber++;
                String[] v = buf.split(" ");
                if ((v[0].equals(myInstruktor)) && (v[3].equals(mySurname))) {
                    int timeInt = 0;
                    timeInt = ParsTime(v[1]);
                    day = v[2];
                    int dayInt = 0;
                    dayInt = Integer.parseInt(day);

                    if ((row == timeInt) && (column == dayInt)) {
                        tblModel.setValueAt(" ", row, column);
                        strNumberSelect = strNumber;
                    }
                }

            }
            Client client = new Client();

            client.client(strNumberSelect, mySurname, "свободно", "C:\\Users\\Елена\\Documents\\NetBeansProjects\\AutoSchool\\src\\TimeTable.txt");

        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }//GEN-LAST:event_jButton5ActionPerformed

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
            java.util.logging.Logger.getLogger(AutoSchoolUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AutoSchoolUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AutoSchoolUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AutoSchoolUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AutoSchoolUI().setVisible(true);

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel IdentInstruktor;
    private javax.swing.JPanel Instruktor;
    private javax.swing.JPanel MainMenu;
    private javax.swing.JTabbedPane Student;
    private javax.swing.JPanel StudentReserv;
    private javax.swing.JPanel SurnameInstruktor;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable3;
    private javax.swing.JTable jTable4;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField15;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables
}
