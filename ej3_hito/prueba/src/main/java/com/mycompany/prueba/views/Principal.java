/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.prueba.views;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.border.BevelBorder;
import javax.swing.table.DefaultTableModel;
import java.sql.Date;
import com.mycompany.prueba.controller.Conexion;
import com.mycompany.prueba.model.Product;

import javax.swing.JTextField;
import java.awt.Window.Type;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.sql.PreparedStatement;
import javax.swing.JMenuBar;
import javax.swing.JTabbedPane;
/**
 *
 * @author joanc
 */ 
public class Principal extends javax.swing.JFrame {
    //private JFrame frmGestinDeProductos;
    //private JTextField nombretxt;
    //private JTextField passwordtxt;
    //private JTextField estadotxt;

    Connection miConexion = new Conexion().conectar();
    
    /**
     * Creates new form Principal
     */
    public Principal() {
        initComponents();
        cargar();
        verProductos();
    }
    private void cargar(){
        System.out.println(miConexion);
    }
    
    private ArrayList<Product> listadoProductos() {
	ArrayList<Product> productos = new ArrayList<Product>();
		
	try {
            Statement st =miConexion.createStatement();
            ResultSet rs = st.executeQuery("select * from productos");
			
            Product producto;
			
            while(rs.next()) {
		producto = new Product(rs.getInt(1),rs.getString(2),rs.getDate(3),rs.getInt(4),rs.getDouble(5),rs.getBoolean(6));
		productos.add(producto);
            }//cierra while
			
            st.close();
            rs.close();
			
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
				
	return productos;
    
    }//cierra el m??todo listadoUsuarios
    /*private void cargar() {
		frmGestinDeProductos = new JFrame();
		frmGestinDeProductos.setAlwaysOnTop(true);
		frmGestinDeProductos.setForeground(Color.MAGENTA);
		frmGestinDeProductos.setTitle("Gesti\u00F3n de usuarios");
		frmGestinDeProductos.getContentPane().setBackground(Color.PINK);
		frmGestinDeProductos.setBounds(100, 100, 694, 432);
		frmGestinDeProductos.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmGestinDeProductos.getContentPane().setLayout(null);
		
		JLabel lblAccesoOk = new JLabel("Acceso ok");
		lblAccesoOk.setForeground(Color.RED);
		lblAccesoOk.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblAccesoOk.setBounds(563, 334, 89, 31);
		frmGestinDeProductos.getContentPane().add(lblAccesoOk);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.ORANGE);
		panel.setBounds(21, 57, 355, 251);
		frmGestinDeProductos.getContentPane().add(panel);
		panel.setLayout(null);
		
		table = new JTable();
		table.setBackground(new Color(153, 153, 255));
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{"id", "usuario", "password", "estado"},
			},
			new String[] {
				"id", "usuario", "password", "estado"
			}
		) {*/
			/**
			 * 
			 *//*
			private static final long serialVersionUID = 1L;
			boolean[] columnEditables = new boolean[] {
				false, false, false, false
			};
			public boolean isCellEditable(int row, int column) {
				return columnEditables[column];
			}
		});
		table.setBorder(new BevelBorder(BevelBorder.LOWERED, Color.RED, null, null, null));
		table.setBounds(32, 60, 313, 180);
		panel.add(table);
		
		JLabel lblListadoDeUsuarios = new JLabel("Listado de usuarios");
		lblListadoDeUsuarios.setForeground(new Color(153, 0, 0));
		lblListadoDeUsuarios.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblListadoDeUsuarios.setBounds(48, 11, 173, 14);
		panel.add(lblListadoDeUsuarios);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.CYAN);
		panel_1.setBounds(418, 57, 218, 253);
		frmGestinDeProductos.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("nombre");
		lblNewLabel.setBounds(10, 14, 73, 14);
		panel_1.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("contrase\u00F1a");
		lblNewLabel_1.setBounds(10, 46, 73, 14);
		panel_1.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("estado");
		lblNewLabel_2.setBounds(10, 78, 73, 14);
		panel_1.add(lblNewLabel_2);
		
		nombretxt = new JTextField();
		nombretxt.setBounds(87, 8, 121, 20);
		panel_1.add(nombretxt);
		nombretxt.setColumns(10);
		
		passwordtxt = new JTextField();
		passwordtxt.setBounds(87, 40, 121, 20);
		panel_1.add(passwordtxt);
		passwordtxt.setColumns(10);
		
		estadotxt = new JTextField();
		estadotxt.setBounds(87, 72, 121, 20);
		panel_1.add(estadotxt);
		estadotxt.setColumns(10);
		
		JButton btnNewButton = new JButton("Nuevo");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setBounds(78, 18, 121, 23);
		frmGestinDeProductos.getContentPane().add(btnNewButton);
		
		JButton btnEliminar = new JButton("Eliminar");
		btnEliminar.setBounds(277, 18, 121, 23);
		frmGestinDeProductos.getContentPane().add(btnEliminar);
		
		JButton btnActualizar = new JButton("Actualizar");
		btnActualizar.setBounds(476, 18, 121, 23);
		frmGestinDeProductos.getContentPane().add(btnActualizar);
*/
    //}//cierra initialize
    private void verProductos() //cargar un modelo con los usuarios del AL
	//la tabla se llena con getModel
    {
	System.out.println("llamada a ver Usuarios");
	ArrayList<Product> productosParaTabla = listadoProductos();
        
	DefaultTableModel modelo = (DefaultTableModel) jTable1.getModel();
        modelo.setRowCount(0);
	Object fila[]=new Object[6];
	for (int i = 0; i < productosParaTabla.size(); i++) {
            fila[0]=productosParaTabla.get(i).getIdProducto();
            fila[1]=productosParaTabla.get(i).getNombre();
            fila[2]=productosParaTabla.get(i).getFechaEnvasado();
            fila[3]=productosParaTabla.get(i).getUnidades();
            fila[4]=productosParaTabla.get(i).getPrecio();
            fila[5]=productosParaTabla.get(i).isDisponible();
            modelo.addRow(fila);
	}
        
		
    }
    private void insertarProductos(Product producto){
		
	try {
            
            PreparedStatement rs =miConexion.prepareStatement("insert into productos values (NULL,?,?,?,?,?)");
            //ResultSet rs = st.executeQuery("insert into productos values (NULL,?,?,?,?,?)");		  
            //PreparedStatement preparedStmt = conn.prepareStatement(sql);
            
            rs.setString  (1, producto.getNombre());
            rs.setDate    (2, producto.getFechaEnvasado());
            rs.setInt     (3, producto.getUnidades());
            rs.setDouble  (4, producto.getPrecio());
            rs.setBoolean (5, producto.isDisponible());
            
            rs.execute();
            
            rs.close();
			
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
				
	//return productos;
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButtonActualizar = new javax.swing.JButton();
        jButtonEliminar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabelNombre = new javax.swing.JLabel();
        jLabelFecha = new javax.swing.JLabel();
        jLabelUnidades = new javax.swing.JLabel();
        jLabelPrecio = new javax.swing.JLabel();
        jLabelDisponible = new javax.swing.JLabel();
        jTextFieldNombre = new javax.swing.JTextField();
        jTextFieldFecha = new javax.swing.JTextField();
        jTextFieldPrecio = new javax.swing.JTextField();
        jSpinnerUnidades = new javax.swing.JSpinner();
        jButtonA??adir = new javax.swing.JButton();
        jCheckBoxDisponible = new javax.swing.JCheckBox();
        jButtonRecargar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Gesti??n de productos");

        jPanel1.setBackground(new java.awt.Color(255, 102, 153));

        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("jLabel1");

        jButtonActualizar.setBackground(new java.awt.Color(60, 63, 65));
        jButtonActualizar.setForeground(new java.awt.Color(255, 255, 255));
        jButtonActualizar.setText("Actualizar");
        jButtonActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonActualizarActionPerformed(evt);
            }
        });

        jButtonEliminar.setBackground(new java.awt.Color(60, 63, 65));
        jButtonEliminar.setForeground(new java.awt.Color(255, 255, 255));
        jButtonEliminar.setText("Eliminar");
        jButtonEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEliminarActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(51, 51, 51));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Listado de Productos");

        jScrollPane1.setBackground(new java.awt.Color(51, 51, 51));
        jScrollPane1.setForeground(new java.awt.Color(153, 153, 153));

        jTable1.setAutoCreateRowSorter(true);
        jTable1.setBackground(new java.awt.Color(102, 102, 102));
        jTable1.setForeground(new java.awt.Color(255, 255, 255));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "IdProducto", "Nombre", "Fecha", "Unidades", "Precio", "Disponible"
            }
        ));
        jTable1.setGridColor(new java.awt.Color(255, 255, 255));
        jTable1.setSelectionForeground(new java.awt.Color(255, 255, 255));
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 454, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(27, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(51, 51, 51));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Producto");

        jLabelNombre.setForeground(new java.awt.Color(255, 255, 255));
        jLabelNombre.setText("Nombre");

        jLabelFecha.setForeground(new java.awt.Color(255, 255, 255));
        jLabelFecha.setText("Fecha");

        jLabelUnidades.setForeground(new java.awt.Color(255, 255, 255));
        jLabelUnidades.setText("Unidades");

        jLabelPrecio.setForeground(new java.awt.Color(255, 255, 255));
        jLabelPrecio.setText("Precio");

        jLabelDisponible.setForeground(new java.awt.Color(255, 255, 255));
        jLabelDisponible.setText("Disponible");

        jTextFieldNombre.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldNombre.setForeground(new java.awt.Color(0, 0, 0));
        jTextFieldNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNombreActionPerformed(evt);
            }
        });

        jTextFieldFecha.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldFecha.setForeground(new java.awt.Color(0, 0, 0));
        jTextFieldFecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldFechaActionPerformed(evt);
            }
        });

        jTextFieldPrecio.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldPrecio.setForeground(new java.awt.Color(0, 0, 0));

        jSpinnerUnidades.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));
        jSpinnerUnidades.setToolTipText("");

        jButtonA??adir.setBackground(new java.awt.Color(60, 63, 65));
        jButtonA??adir.setForeground(new java.awt.Color(255, 255, 255));
        jButtonA??adir.setText("A??adir");
        jButtonA??adir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonA??adirActionPerformed(evt);
            }
        });

        jCheckBoxDisponible.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxDisponibleActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabelNombre, javax.swing.GroupLayout.DEFAULT_SIZE, 69, Short.MAX_VALUE)
                                .addGap(12, 12, 12))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabelFecha, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(25, 25, 25))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabelUnidades, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(7, 7, 7))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabelPrecio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(23, 23, 23))
                            .addComponent(jLabelDisponible, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(32, 32, 32)
                                .addComponent(jTextFieldPrecio, javax.swing.GroupLayout.DEFAULT_SIZE, 87, Short.MAX_VALUE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextFieldNombre)
                                    .addComponent(jTextFieldFecha)
                                    .addComponent(jSpinnerUnidades)))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(32, 32, 32)
                                .addComponent(jCheckBoxDisponible, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonA??adir, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(2, 2, 2)))
                .addGap(18, 18, 18))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelFecha))
                .addGap(24, 24, 24)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jSpinnerUnidades, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelUnidades))
                .addGap(25, 25, 25)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelPrecio))
                .addGap(26, 26, 26)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelDisponible)
                    .addComponent(jCheckBoxDisponible))
                .addGap(18, 18, 18)
                .addComponent(jButtonA??adir)
                .addContainerGap(43, Short.MAX_VALUE))
        );

        jButtonRecargar.setBackground(new java.awt.Color(60, 63, 65));
        jButtonRecargar.setForeground(new java.awt.Color(255, 255, 255));
        jButtonRecargar.setText("Recargar p??gina");
        jButtonRecargar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRecargarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jButtonRecargar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(93, 93, 93)
                                .addComponent(jButtonEliminar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButtonActualizar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(20, 20, 20))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jButtonRecargar))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButtonEliminar)
                            .addComponent(jButtonActualizar))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldFechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldFechaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldFechaActionPerformed

    private void jTextFieldNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldNombreActionPerformed

    private void jButtonA??adirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonA??adirActionPerformed
        // TODO add your handling code here:
        double precio = Double.parseDouble(jTextFieldPrecio.getText());
        Date fecha = Date.valueOf(jTextFieldFecha.getText());
        Product producto = new Product(jTextFieldNombre.getText(), fecha,(Integer)jSpinnerUnidades.getValue(),precio,jCheckBoxDisponible.isSelected());
        insertarProductos(producto);
    }//GEN-LAST:event_jButtonA??adirActionPerformed

    private void jButtonActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonActualizarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonActualizarActionPerformed

    private void jButtonEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEliminarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonEliminarActionPerformed

    private void jCheckBoxDisponibleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxDisponibleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBoxDisponibleActionPerformed

    private void jButtonRecargarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRecargarActionPerformed
        // TODO add your handling code here:
        verProductos();
    }//GEN-LAST:event_jButtonRecargarActionPerformed

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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonActualizar;
    private javax.swing.JButton jButtonA??adir;
    private javax.swing.JButton jButtonEliminar;
    private javax.swing.JButton jButtonRecargar;
    private javax.swing.JCheckBox jCheckBoxDisponible;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabelDisponible;
    private javax.swing.JLabel jLabelFecha;
    private javax.swing.JLabel jLabelNombre;
    private javax.swing.JLabel jLabelPrecio;
    private javax.swing.JLabel jLabelUnidades;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSpinner jSpinnerUnidades;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextFieldFecha;
    private javax.swing.JTextField jTextFieldNombre;
    private javax.swing.JTextField jTextFieldPrecio;
    // End of variables declaration//GEN-END:variables
}
