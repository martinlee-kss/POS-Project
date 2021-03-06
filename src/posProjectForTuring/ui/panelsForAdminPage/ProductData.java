package posProjectForTuring.ui.panelsForAdminPage;

import java.util.List;
import javax.swing.table.DefaultTableModel;
import posProjectForTuring.controller.Subscriber;
import posProjectForTuring.model.Category;
import posProjectForTuring.model.Product;
import posProjectForTuring.model.Supplier;
import posProjectForTuring.model.service.CategoryService;
import posProjectForTuring.model.service.ProductService;
import posProjectForTuring.model.service.SupplierService;
import posProjectForTuring.model.service.impl.CategoryServiceImpl;
import posProjectForTuring.model.service.impl.ProductServiceImpl;
import posProjectForTuring.model.service.impl.SupplierServiceImpl;

public class ProductData extends javax.swing.JPanel implements Subscriber {    
    ProductService productService = new ProductServiceImpl();
    CategoryService categoryService = new CategoryServiceImpl();
    SupplierService supplierService = new SupplierServiceImpl();
    
    public ProductData() {
        initComponents();
        this.tableLoader();
    }
    
    private void tableLoader(){
        this.loadProducts();
        this.loadCategories();
        this.loadSuppliers();
    }
    
    private void loadProducts(){
        List<Product> products = productService.getAllProducts();
        DefaultTableModel model = (DefaultTableModel) this.tblProductData.getModel();
        model.setRowCount(0);
        
        for(Product product: products){
            Object row[] = new Object[8];
            row[0] = product.getId();
            row[1] = product.getName();
            row[2] = product.getUnitPrice()+" MMK";
            row[3] = product.getSellingPrice()+" MMK";
            row[4] = this.categoryService.getCategoryName(product.getCategory());
            row[5] = this.supplierService.getSupplierName(product.getSupplier());
            row[6] = product.getStock();
            row[7] = product.getLastUpdated();
            
            model.addRow(row);
        }
    }
    
    private void loadCategories(){
        List<Category> categories = categoryService.getAllCategories();
        DefaultTableModel model = (DefaultTableModel) this.tblCategory.getModel();
        model.setRowCount(0);
        
        for(Category category: categories){
            Object row[] = new Object[2];
            row[0] = category.getId();
            row[1] = category.getName();
            
            model.addRow(row);
        }
    }
    
    private void loadSuppliers(){        
        List<Supplier> suppliers = supplierService.getAllSuppliers();
        DefaultTableModel model = (DefaultTableModel) this.jTable1.getModel();
        model.setRowCount(0);
        
        for(Supplier supplier: suppliers){
            Object row[] = new Object[4];
            row[0] = supplier.getId();
            row[1] = supplier.getName();
            row[2] = supplier.getAddress();
            row[3] = supplier.getContactNo();
            
            model.addRow(row);
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jtbProductData = new javax.swing.JTabbedPane();
        pnlProductDetails = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblProductData = new javax.swing.JTable();
        btnRefreshProduct = new javax.swing.JButton();
        pnlCategory = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblCategory = new javax.swing.JTable();
        btnRefreshCategory = new javax.swing.JButton();
        pnlSupplierDetails = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        btnRefreshSupplier = new javax.swing.JButton();

        setBackground(java.awt.Color.decode("#263238"));
        setBorder(javax.swing.BorderFactory.createMatteBorder(0, 10, 0, 0, new java.awt.Color(255, 255, 255)));

        jtbProductData.setBackground(java.awt.Color.decode("#263238"));
        jtbProductData.setForeground(new java.awt.Color(240, 240, 240));

        pnlProductDetails.setBackground(java.awt.Color.decode("#263238"));

        tblProductData.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Product ID", "Product Name", "Unit Price", "Selling Price", "Category", "Supplier", "Stock", "Last Updated"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblProductData);
        if (tblProductData.getColumnModel().getColumnCount() > 0) {
            tblProductData.getColumnModel().getColumn(0).setPreferredWidth(50);
            tblProductData.getColumnModel().getColumn(1).setPreferredWidth(250);
        }

        btnRefreshProduct.setText("Refresh");
        btnRefreshProduct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRefreshProductActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlProductDetailsLayout = new javax.swing.GroupLayout(pnlProductDetails);
        pnlProductDetails.setLayout(pnlProductDetailsLayout);
        pnlProductDetailsLayout.setHorizontalGroup(
            pnlProductDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlProductDetailsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlProductDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1461, Short.MAX_VALUE)
                    .addGroup(pnlProductDetailsLayout.createSequentialGroup()
                        .addComponent(btnRefreshProduct)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        pnlProductDetailsLayout.setVerticalGroup(
            pnlProductDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlProductDetailsLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnRefreshProduct)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 912, Short.MAX_VALUE)
                .addContainerGap())
        );

        jtbProductData.addTab("Product Details", pnlProductDetails);

        pnlCategory.setBackground(java.awt.Color.decode("#263238"));

        tblCategory.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Category"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tblCategory);
        if (tblCategory.getColumnModel().getColumnCount() > 0) {
            tblCategory.getColumnModel().getColumn(0).setResizable(false);
            tblCategory.getColumnModel().getColumn(1).setResizable(false);
            tblCategory.getColumnModel().getColumn(1).setPreferredWidth(1000);
        }

        btnRefreshCategory.setText("Refresh");
        btnRefreshCategory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRefreshCategoryActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlCategoryLayout = new javax.swing.GroupLayout(pnlCategory);
        pnlCategory.setLayout(pnlCategoryLayout);
        pnlCategoryLayout.setHorizontalGroup(
            pnlCategoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCategoryLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlCategoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 1461, Short.MAX_VALUE)
                    .addGroup(pnlCategoryLayout.createSequentialGroup()
                        .addComponent(btnRefreshCategory)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        pnlCategoryLayout.setVerticalGroup(
            pnlCategoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlCategoryLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnRefreshCategory)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 912, Short.MAX_VALUE)
                .addContainerGap())
        );

        jtbProductData.addTab("Category", pnlCategory);

        pnlSupplierDetails.setBackground(java.awt.Color.decode("#263238"));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Supplier Id", "Supplier Name", "Address", "Contact Number"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setPreferredWidth(50);
            jTable1.getColumnModel().getColumn(1).setPreferredWidth(300);
            jTable1.getColumnModel().getColumn(2).setPreferredWidth(500);
        }

        btnRefreshSupplier.setText("Refresh");
        btnRefreshSupplier.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRefreshSupplierActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlSupplierDetailsLayout = new javax.swing.GroupLayout(pnlSupplierDetails);
        pnlSupplierDetails.setLayout(pnlSupplierDetailsLayout);
        pnlSupplierDetailsLayout.setHorizontalGroup(
            pnlSupplierDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSupplierDetailsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlSupplierDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 1461, Short.MAX_VALUE)
                    .addGroup(pnlSupplierDetailsLayout.createSequentialGroup()
                        .addComponent(btnRefreshSupplier)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        pnlSupplierDetailsLayout.setVerticalGroup(
            pnlSupplierDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlSupplierDetailsLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnRefreshSupplier)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 912, Short.MAX_VALUE)
                .addContainerGap())
        );

        jtbProductData.addTab("Supplier Details", pnlSupplierDetails);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jtbProductData)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jtbProductData)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnRefreshSupplierActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRefreshSupplierActionPerformed
        this.loadSuppliers();
    }//GEN-LAST:event_btnRefreshSupplierActionPerformed

    private void btnRefreshCategoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRefreshCategoryActionPerformed
        this.loadCategories();
    }//GEN-LAST:event_btnRefreshCategoryActionPerformed

    private void btnRefreshProductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRefreshProductActionPerformed
        this.loadProducts();
    }//GEN-LAST:event_btnRefreshProductActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRefreshCategory;
    private javax.swing.JButton btnRefreshProduct;
    private javax.swing.JButton btnRefreshSupplier;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTabbedPane jtbProductData;
    private javax.swing.JPanel pnlCategory;
    private javax.swing.JPanel pnlProductDetails;
    private javax.swing.JPanel pnlSupplierDetails;
    private javax.swing.JTable tblCategory;
    private javax.swing.JTable tblProductData;
    // End of variables declaration//GEN-END:variables

    @Override
    public void update() {
        this.loadProducts();
        this.loadCategories();
        this.loadSuppliers();
    }
}
