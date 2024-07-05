package org.geotools.fileloader;



import java.io.File;
import java.io.IOException;

import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

import org.geotools.coverage.grid.GridCoverage2D;
import org.geotools.coverage.grid.io.AbstractGridFormat;
import org.geotools.coverage.grid.io.GridCoverage2DReader;
import org.geotools.coverage.grid.io.GridFormatFinder;
import org.geotools.coverage.processing.CoverageProcessor;
import org.geotools.coverage.processing.Operations;
import org.geotools.factory.Hints;
import org.geotools.gce.geotiff.GeoTiffFormat;
import org.geotools.geometry.Envelope2D;
import org.geotools.geometry.jts.ReferencedEnvelope;
import org.geotools.resources.Arguments;
import org.opengis.geometry.Envelope;
import org.opengis.parameter.ParameterValueGroup;
import org.opengis.referencing.crs.CoordinateReferenceSystem;



/**
 * @author Adebisi
 *
 */
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Adebisi
 *
 */
public class ImageTileGUI extends javax.swing.JDialog{

    // Variables declaration - do not modify
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;

    JFileChooser fc;

    private final int NUM_HORIZONTAL_TILES = 16;
    private final int NUM_VERTICAL_TILES = 8;

    private Integer numberOfHorizontalTiles = NUM_HORIZONTAL_TILES;
    private Integer numberOfVerticalTiles = NUM_VERTICAL_TILES;
    private Double tileScale;
    private File inputFile;
    private File outputDirectory;

    // End of variables declaration

    /**
     * Creates new form ImageTileGUI
     */
    public ImageTileGUI() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    private void initComponents() {
        fc = new JFileChooser();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        setTitle("Image Tile Convertor");

        jLabel1.setText("Input Directory File");
        jLabel1.setName("inputDirectioryFile"); // NOI18N

        jTextField1.setName("inputDirectoryFileTextField"); // NOI18N
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jButton1.setText("Run");
        jButton1.setName("runImageTile"); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel2.setText("Output Directory File");
        jLabel2.setName("inputDirectioryFile"); // NOI18N

        jTextField2.setName("inputDirectoryFileTextField"); // NOI18N
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });

        jLabel3.setText("Number of Horizontal Tiles");
        jLabel3.setName("numberOfHorizontalTile"); // NOI18N

        jTextField3.setText("16");
        jTextField3.setName("inputDirectoryFileTextField"); // NOI18N

        jLabel4.setText("Number of Vertical Tiles");
        jLabel4.setName("numberOfVerticalTile"); // NOI18N

        jTextField4.setText("8");
        jTextField4.setName("inputDirectoryFileTextField"); // NOI18N

        jLabel5.setText("Tile Scale");
        jLabel5.setName("tileScale"); // NOI18N

        jTextField5.setText("2.0");
        jTextField5.setName("inputDirectoryFileTextField"); // NOI18N

        jButton2.setText("Browse");
        jButton2.setHideActionText(true);
        jButton2.setName("inputFileBrowseButton"); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Browse");
        jButton3.setHideActionText(true);
        jButton3.setName("outputFileBrowseButton"); // NOI18N
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addGap(0, 0, Short.MAX_VALUE)
                                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                                        .addComponent(jTextField1, javax.swing.GroupLayout.DEFAULT_SIZE, 328, Short.MAX_VALUE)
                                                                        .addComponent(jTextField2))
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                                .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                        .addGroup(layout.createSequentialGroup()
                                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                                        .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                                                        .addComponent(jTextField3, javax.swing.GroupLayout.DEFAULT_SIZE, 108, Short.MAX_VALUE)
                                                                                        .addComponent(jTextField4))))
                                                                .addGap(226, 226, 226)))
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jButton2, javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addComponent(jButton3, javax.swing.GroupLayout.Alignment.TRAILING))))
                                .addContainerGap())
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(19, 19, 19)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel1)
                                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jButton2))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel2)
                                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jButton3))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel3)
                                        .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel4)
                                        .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel5)
                                        .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(jButton1)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }


    private String getFileExtension(File file) {
        String name = file.getName();
        try {
            return name.substring(name.lastIndexOf(".") + 1);
        } catch (Exception e) {
            return "";
        }
    }

    public Integer getNumberOfHorizontalTiles() {
        return numberOfHorizontalTiles;
    }

    public void setNumberOfHorizontalTiles(Integer numberOfHorizontalTiles) {
        this.numberOfHorizontalTiles = numberOfHorizontalTiles;
    }

    public Integer getNumberOfVerticalTiles() {
        return numberOfVerticalTiles;
    }

    public void setNumberOfVerticalTiles(Integer numberOfVerticalTiles) {
        this.numberOfVerticalTiles = numberOfVerticalTiles;
    }

    public File getInputFile() {
        return inputFile;
    }

    public void setInputFile(File inputFile) {
        this.inputFile = inputFile;
    }

    public File getOutputDirectory() {
        return outputDirectory;
    }

    public void setOutputDirectory(File outputDirectory) {
        this.outputDirectory = outputDirectory;
    }

    public Double getTileScale() {
        return tileScale;
    }

    public void setTileScale(Double tileScale) {
        this.tileScale = tileScale;
    }


    public static void mainImageTiler(String[] args) throws Exception {

        //GeoTools provides utility classes to parse command line arguments
        Arguments processedArgs = new Arguments(args);
        ImageTileGUI tiler = new ImageTileGUI();

        try {
            tiler.setInputFile(new File(processedArgs.getRequiredString("-f")));
            tiler.setOutputDirectory(new File(processedArgs.getRequiredString("-o")));
            tiler.setNumberOfHorizontalTiles(processedArgs.getOptionalInteger("-htc"));
            tiler.setNumberOfVerticalTiles(processedArgs.getOptionalInteger("-vtc"));
            tiler.setTileScale(processedArgs.getOptionalDouble("-scale"));
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
            printUsage();
            System.exit(1);
        }

        tiler.tile();
    }

    private static void printUsage() {
        System.out.println("Usage: -f inputFile -o outputDirectory [-tw tileWidth<default:256> "
                + "-th tileHeight<default:256> ");
        System.out.println("-htc horizontalTileCount<default:16> -vtc verticalTileCount<default:8>");
    }


    private void tile() throws IOException {
        AbstractGridFormat format = GridFormatFinder.findFormat(this.getInputFile());
        String fileExtension = this.getFileExtension(this.getInputFile());

        //working around a bug/quirk in geotiff loading via format.getReader which doesn't set this
        //correctly
        Hints hints = null;
        if (format instanceof GeoTiffFormat) {
            hints = new Hints(Hints.FORCE_LONGITUDE_FIRST_AXIS_ORDER,Boolean.TRUE);
        }

        GridCoverage2DReader gridReader = (GridCoverage2DReader) format.getReader(this.getInputFile(),hints);
        GridCoverage2D gridCoverage = gridReader.read(null);
        Envelope2D coverageEnvelope = gridCoverage.getEnvelope2D();
        double coverageMinX = coverageEnvelope.getBounds().getMinX();
        double coverageMaxX = coverageEnvelope.getBounds().getMaxX();
        double coverageMinY = coverageEnvelope.getBounds().getMinY();
        double coverageMaxY = coverageEnvelope.getBounds().getMaxY();

        int htc = this.getNumberOfHorizontalTiles() != null ? this.getNumberOfHorizontalTiles() : NUM_HORIZONTAL_TILES;
        int vtc = this.getNumberOfVerticalTiles() != null ? this.getNumberOfVerticalTiles() : NUM_VERTICAL_TILES;

        double geographicTileWidth = (coverageMaxX - coverageMinX) / (double)htc;
        double geographicTileHeight = (coverageMaxY - coverageMinY) / (double)vtc;

        CoordinateReferenceSystem targetCRS = gridCoverage.getCoordinateReferenceSystem();

        //make sure to create our output directory if it doesn't already exist
        File tileDirectory = this.getOutputDirectory();
        if (!tileDirectory.exists()) {
            tileDirectory.mkdirs();
        }

        //iterate over our tile counts
        for (int i = 0; i < htc; i++) {
            for (int j = 0; j < vtc; j++) {

                System.out.println("Processing tile at indices i: " + i + " and j: " + j);
                //create the envelope of the tile
                Envelope envelope = getTileEnvelope(coverageMinX, coverageMinY, geographicTileWidth,
                        geographicTileHeight, targetCRS, i, j);

                GridCoverage2D finalCoverage = cropCoverage(gridCoverage, envelope);

                if (this.getTileScale() != null) {
                    finalCoverage = scaleCoverage(finalCoverage);
                }

                //use the AbstractGridFormat's writer to write out the tile
                File tileFile = new File(tileDirectory, i + "_" + j + "." + fileExtension);
                format.getWriter(tileFile).write(finalCoverage, null);
            }
        }

    }


    private Envelope getTileEnvelope(double coverageMinX, double coverageMinY,
                                     double geographicTileWidth, double geographicTileHeight,
                                     CoordinateReferenceSystem targetCRS, int horizontalIndex, int verticalIndex) {

        double envelopeStartX = (horizontalIndex * geographicTileWidth) + coverageMinX;
        double envelopeEndX = envelopeStartX + geographicTileWidth;
        double envelopeStartY = (verticalIndex * geographicTileHeight) + coverageMinY;
        double envelopeEndY = envelopeStartY + geographicTileHeight;

        return new ReferencedEnvelope(
                envelopeStartX, envelopeEndX, envelopeStartY, envelopeEndY, targetCRS);
    }


    private GridCoverage2D cropCoverage(GridCoverage2D gridCoverage, Envelope envelope) {
        CoverageProcessor processor =  CoverageProcessor.getInstance();

        //An example of manually creating the operation and parameters we want
        final ParameterValueGroup param = processor.getOperation("CoverageCrop").getParameters();
        param.parameter("Source").setValue(gridCoverage);
        param.parameter("Envelope").setValue(envelope);

        return (GridCoverage2D) processor.doOperation(param);
    }

    /**
     * Scale the coverage based on the set tileScale
     *
     * As an alternative to using parameters to do the operations, we can use the
     * Operations class to do them in a slightly more type safe way.
     *
     * @param coverage the coverage to scale
     * @return the scaled coverage
     */
    private GridCoverage2D scaleCoverage(GridCoverage2D coverage) {
        Operations ops = new Operations(null);
        coverage = (GridCoverage2D) ops.scale(coverage, this.getTileScale(), this.getTileScale(), 0, 0);
        return coverage;
    }

    private void jButton1ActionPerformed(java.awt.event.ActionEvent e) {

        String textField1=jTextField1.getText();
        System.out.println("Input File Path:"+textField1);
        String textField2=jTextField2.getText();
        System.out.println("Output File Path:"+textField2);

        String textField3=jTextField3.getText();
        System.out.println("Number of Horizontal Tiles:"+textField3);

        String textField4=jTextField4.getText();
        System.out.println("Number of Vertical Tiles:"+textField4);

        String textField5=jTextField5.getText();
        System.out.println("Tile Scale:"+textField5);

        String [] params={"-f ",textField1,"-htc ",textField3,"-vtc ",textField4,"-o ",textField2,"-scale ",textField5};

        try {
            mainImageTiler(params);
            JOptionPane.showMessageDialog(null,
                    String.format("Image Tiles Generation Successful!\n" +
                            "Generated File Path:%S\n",textField2));
        } catch (Exception e1) {
            JOptionPane.showMessageDialog(null,
                    String.format("Image Tiles Fail!\n" +
                            "Please Checks Input and Out File Pathe and It's format:\n" +
                            "%S\n" +
                            "%S\n", textField1, textField2));
            e1.printStackTrace();
        }



    }
    private void jButton2ActionPerformed(java.awt.event.ActionEvent e) {

        int returnVal = fc.showOpenDialog(ImageTileGUI.this);

        if (returnVal == JFileChooser.APPROVE_OPTION) {
            File file = fc.getSelectedFile();
            //This is where a real application would open the file.
            String absolutePath =file.getAbsolutePath();
            String value=absolutePath.replaceAll("\\\\", "/");
            String value2=value.replace(":/", "://");
            System.out.println("Input File Directory path: " +value2);
            jTextField1.setText(value2);
        } else {
            jTextField1.setText("File not");
        }
        jTextField1.setCaretPosition(jTextField1.getDocument().getLength());


    }

    private void jButton3ActionPerformed(java.awt.event.ActionEvent e) {

        int returnVal = fc.showSaveDialog(ImageTileGUI.this);
        if (returnVal == JFileChooser.APPROVE_OPTION) {
            File file = fc.getSelectedFile();
            //This is where a real application would open the file.
            String absolutePath =file.getAbsolutePath();
            String value=absolutePath.replaceAll("\\\\", "/");
            String value2=value.replace(":/", "://");
            System.out.println("Output File Directory path:" + value2);
            String value3=value2.substring(0, value2.lastIndexOf('.'));
            System.out.println("Output File Directory path:" + value3);
            jTextField2.setText(value3);

        } else {
            jTextField2.setText("File not");
        }
        jTextField2.setCaretPosition(jTextField2.getDocument().getLength());

    }


    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }


    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ImageTileGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ImageTileGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ImageTileGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ImageTileGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                ImageTileGUI dialog = new ImageTileGUI();
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }
}
