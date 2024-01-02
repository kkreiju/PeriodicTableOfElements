import javax.swing.*;

public class GUI extends javax.swing.JFrame {
    Elements e = new Elements();
    String title;
    
    public GUI() {
        initComponents();
        ImageIcon logo = new ImageIcon(getClass().getResource("/logo.png"));
        this.setIconImage(logo.getImage());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        oganesson = new javax.swing.JLabel();
        radon = new javax.swing.JLabel();
        xenon = new javax.swing.JLabel();
        krypton = new javax.swing.JLabel();
        argon = new javax.swing.JLabel();
        neon = new javax.swing.JLabel();
        helium = new javax.swing.JLabel();
        tennessine = new javax.swing.JLabel();
        astatine = new javax.swing.JLabel();
        iodine = new javax.swing.JLabel();
        bromine = new javax.swing.JLabel();
        chlorine = new javax.swing.JLabel();
        flourine = new javax.swing.JLabel();
        livermorium = new javax.swing.JLabel();
        polonium = new javax.swing.JLabel();
        tellurium = new javax.swing.JLabel();
        selenium = new javax.swing.JLabel();
        sulfur = new javax.swing.JLabel();
        oxygen = new javax.swing.JLabel();
        moscovium = new javax.swing.JLabel();
        bismuth = new javax.swing.JLabel();
        antimony = new javax.swing.JLabel();
        arsenic = new javax.swing.JLabel();
        phosphorus = new javax.swing.JLabel();
        nitrogen = new javax.swing.JLabel();
        flerovium = new javax.swing.JLabel();
        lead = new javax.swing.JLabel();
        tin = new javax.swing.JLabel();
        germanium = new javax.swing.JLabel();
        silicon = new javax.swing.JLabel();
        carbon = new javax.swing.JLabel();
        nihonium = new javax.swing.JLabel();
        thallium = new javax.swing.JLabel();
        indium = new javax.swing.JLabel();
        gallium = new javax.swing.JLabel();
        aluminum = new javax.swing.JLabel();
        boron = new javax.swing.JLabel();
        copernicium = new javax.swing.JLabel();
        mercury = new javax.swing.JLabel();
        cadmium = new javax.swing.JLabel();
        zinc = new javax.swing.JLabel();
        roentgenium = new javax.swing.JLabel();
        gold = new javax.swing.JLabel();
        silver = new javax.swing.JLabel();
        copper = new javax.swing.JLabel();
        darmstadtium = new javax.swing.JLabel();
        platinum = new javax.swing.JLabel();
        palladium = new javax.swing.JLabel();
        nickel = new javax.swing.JLabel();
        meitnerium = new javax.swing.JLabel();
        iridium = new javax.swing.JLabel();
        rhodium = new javax.swing.JLabel();
        cobalt = new javax.swing.JLabel();
        hassium = new javax.swing.JLabel();
        osmium = new javax.swing.JLabel();
        ruthenium = new javax.swing.JLabel();
        iron = new javax.swing.JLabel();
        bohrium = new javax.swing.JLabel();
        rhenium = new javax.swing.JLabel();
        technetium = new javax.swing.JLabel();
        manganese = new javax.swing.JLabel();
        seaborgium = new javax.swing.JLabel();
        tungsten = new javax.swing.JLabel();
        molybdenum = new javax.swing.JLabel();
        chromium = new javax.swing.JLabel();
        dubnium = new javax.swing.JLabel();
        tantalum = new javax.swing.JLabel();
        niobium = new javax.swing.JLabel();
        vanadium = new javax.swing.JLabel();
        rutherfordium = new javax.swing.JLabel();
        hafnium = new javax.swing.JLabel();
        zirconium = new javax.swing.JLabel();
        titanium = new javax.swing.JLabel();
        actinium = new javax.swing.JLabel();
        lanthanum = new javax.swing.JLabel();
        yttrium = new javax.swing.JLabel();
        scandium = new javax.swing.JLabel();
        radium = new javax.swing.JLabel();
        barium = new javax.swing.JLabel();
        strontium = new javax.swing.JLabel();
        calcium = new javax.swing.JLabel();
        magnesium = new javax.swing.JLabel();
        beryllium = new javax.swing.JLabel();
        francium = new javax.swing.JLabel();
        cesium = new javax.swing.JLabel();
        rubidium = new javax.swing.JLabel();
        potassium = new javax.swing.JLabel();
        sodium = new javax.swing.JLabel();
        hydrogen = new javax.swing.JLabel();
        lithium = new javax.swing.JLabel();
        lutetium = new javax.swing.JLabel();
        ytterbium = new javax.swing.JLabel();
        thulium = new javax.swing.JLabel();
        erbium = new javax.swing.JLabel();
        holmium = new javax.swing.JLabel();
        dysprosium = new javax.swing.JLabel();
        terbium = new javax.swing.JLabel();
        gadolinium = new javax.swing.JLabel();
        europium = new javax.swing.JLabel();
        samarium = new javax.swing.JLabel();
        promethium = new javax.swing.JLabel();
        neodymium = new javax.swing.JLabel();
        praseodymium = new javax.swing.JLabel();
        cerium = new javax.swing.JLabel();
        lawrencium = new javax.swing.JLabel();
        nobelium = new javax.swing.JLabel();
        mendelevium = new javax.swing.JLabel();
        fermium = new javax.swing.JLabel();
        einsteinium = new javax.swing.JLabel();
        californium = new javax.swing.JLabel();
        berkelium = new javax.swing.JLabel();
        curium = new javax.swing.JLabel();
        americium = new javax.swing.JLabel();
        plutonium = new javax.swing.JLabel();
        neptunium = new javax.swing.JLabel();
        uranium = new javax.swing.JLabel();
        protactinium = new javax.swing.JLabel();
        thorium = new javax.swing.JLabel();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Periodic Table of Elements");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        oganesson.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                oganessonMouseClicked(evt);
            }
        });
        getContentPane().add(oganesson, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 480, 60, 60));

        radon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                radonMouseClicked(evt);
            }
        });
        getContentPane().add(radon, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 430, 60, 50));

        xenon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                xenonMouseClicked(evt);
            }
        });
        getContentPane().add(xenon, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 370, 60, 60));

        krypton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                kryptonMouseClicked(evt);
            }
        });
        getContentPane().add(krypton, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 320, 60, 50));

        argon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                argonMouseClicked(evt);
            }
        });
        getContentPane().add(argon, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 260, 60, 60));

        neon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                neonMouseClicked(evt);
            }
        });
        getContentPane().add(neon, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 210, 60, 50));

        helium.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                heliumMouseClicked(evt);
            }
        });
        getContentPane().add(helium, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 150, 60, 60));

        tennessine.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tennessineMouseClicked(evt);
            }
        });
        getContentPane().add(tennessine, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 480, 60, 60));

        astatine.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                astatineMouseClicked(evt);
            }
        });
        getContentPane().add(astatine, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 430, 60, 50));

        iodine.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                iodineMouseClicked(evt);
            }
        });
        getContentPane().add(iodine, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 370, 60, 60));

        bromine.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bromineMouseClicked(evt);
            }
        });
        getContentPane().add(bromine, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 320, 60, 50));

        chlorine.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                chlorineMouseClicked(evt);
            }
        });
        getContentPane().add(chlorine, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 260, 60, 60));

        flourine.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                flourineMouseClicked(evt);
            }
        });
        getContentPane().add(flourine, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 210, 60, 60));

        livermorium.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                livermoriumMouseClicked(evt);
            }
        });
        getContentPane().add(livermorium, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 480, 60, 60));

        polonium.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                poloniumMouseClicked(evt);
            }
        });
        getContentPane().add(polonium, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 430, 60, 50));

        tellurium.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                telluriumMouseClicked(evt);
            }
        });
        getContentPane().add(tellurium, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 370, 60, 60));

        selenium.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                seleniumMouseClicked(evt);
            }
        });
        getContentPane().add(selenium, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 320, 60, 50));

        sulfur.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                sulfurMouseClicked(evt);
            }
        });
        getContentPane().add(sulfur, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 260, 60, 60));

        oxygen.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                oxygenMouseClicked(evt);
            }
        });
        getContentPane().add(oxygen, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 210, 60, 60));

        moscovium.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                moscoviumMouseClicked(evt);
            }
        });
        getContentPane().add(moscovium, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 480, 50, 60));

        bismuth.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bismuthMouseClicked(evt);
            }
        });
        getContentPane().add(bismuth, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 430, 50, 50));

        antimony.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                antimonyMouseClicked(evt);
            }
        });
        getContentPane().add(antimony, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 370, 50, 60));

        arsenic.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                arsenicMouseClicked(evt);
            }
        });
        getContentPane().add(arsenic, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 320, 50, 50));

        phosphorus.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                phosphorusMouseClicked(evt);
            }
        });
        getContentPane().add(phosphorus, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 260, 50, 60));

        nitrogen.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                nitrogenMouseClicked(evt);
            }
        });
        getContentPane().add(nitrogen, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 210, 50, 50));

        flerovium.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                fleroviumMouseClicked(evt);
            }
        });
        getContentPane().add(flerovium, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 480, 60, 60));

        lead.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                leadMouseClicked(evt);
            }
        });
        getContentPane().add(lead, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 430, 60, 50));

        tin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tinMouseClicked(evt);
            }
        });
        getContentPane().add(tin, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 370, 60, 60));

        germanium.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                germaniumMouseClicked(evt);
            }
        });
        getContentPane().add(germanium, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 320, 60, 50));

        silicon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                siliconMouseClicked(evt);
            }
        });
        getContentPane().add(silicon, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 260, 60, 60));

        carbon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                carbonMouseClicked(evt);
            }
        });
        getContentPane().add(carbon, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 210, 60, 50));

        nihonium.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                nihoniumMouseClicked(evt);
            }
        });
        getContentPane().add(nihonium, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 480, 50, 60));

        thallium.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                thalliumMouseClicked(evt);
            }
        });
        getContentPane().add(thallium, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 430, 50, 50));

        indium.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                indiumMouseClicked(evt);
            }
        });
        getContentPane().add(indium, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 370, 50, 60));

        gallium.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                galliumMouseClicked(evt);
            }
        });
        getContentPane().add(gallium, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 320, 50, 60));

        aluminum.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                aluminumMouseClicked(evt);
            }
        });
        getContentPane().add(aluminum, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 260, 50, 60));

        boron.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                boronMouseClicked(evt);
            }
        });
        getContentPane().add(boron, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 210, 50, 50));

        copernicium.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                coperniciumMouseClicked(evt);
            }
        });
        getContentPane().add(copernicium, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 480, 60, 60));

        mercury.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mercuryMouseClicked(evt);
            }
        });
        getContentPane().add(mercury, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 430, 60, 50));

        cadmium.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cadmiumMouseClicked(evt);
            }
        });
        getContentPane().add(cadmium, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 370, 60, 60));

        zinc.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                zincMouseClicked(evt);
            }
        });
        getContentPane().add(zinc, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 320, 60, 60));

        roentgenium.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                roentgeniumMouseClicked(evt);
            }
        });
        getContentPane().add(roentgenium, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 480, 50, 60));

        gold.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                goldMouseClicked(evt);
            }
        });
        getContentPane().add(gold, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 430, 50, 60));

        silver.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                silverMouseClicked(evt);
            }
        });
        getContentPane().add(silver, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 370, 50, 60));

        copper.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                copperMouseClicked(evt);
            }
        });
        getContentPane().add(copper, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 320, 50, 60));

        darmstadtium.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                darmstadtiumMouseClicked(evt);
            }
        });
        getContentPane().add(darmstadtium, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 480, 60, 60));

        platinum.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                platinumMouseClicked(evt);
            }
        });
        getContentPane().add(platinum, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 430, 60, 50));

        palladium.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                palladiumMouseClicked(evt);
            }
        });
        getContentPane().add(palladium, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 370, 60, 60));

        nickel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                nickelMouseClicked(evt);
            }
        });
        getContentPane().add(nickel, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 320, 60, 50));

        meitnerium.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                meitneriumMouseClicked(evt);
            }
        });
        getContentPane().add(meitnerium, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 480, 60, 60));

        iridium.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                iridiumMouseClicked(evt);
            }
        });
        getContentPane().add(iridium, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 430, 60, 50));

        rhodium.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rhodiumMouseClicked(evt);
            }
        });
        getContentPane().add(rhodium, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 370, 60, 60));

        cobalt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cobaltMouseClicked(evt);
            }
        });
        getContentPane().add(cobalt, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 320, 60, 50));

        hassium.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                hassiumMouseClicked(evt);
            }
        });
        getContentPane().add(hassium, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 480, 60, 60));

        osmium.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                osmiumMouseClicked(evt);
            }
        });
        getContentPane().add(osmium, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 430, 60, 50));

        ruthenium.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rutheniumMouseClicked(evt);
            }
        });
        getContentPane().add(ruthenium, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 370, 60, 60));

        iron.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ironMouseClicked(evt);
            }
        });
        getContentPane().add(iron, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 320, 60, 60));

        bohrium.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bohriumMouseClicked(evt);
            }
        });
        getContentPane().add(bohrium, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 480, 60, 60));

        rhenium.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rheniumMouseClicked(evt);
            }
        });
        getContentPane().add(rhenium, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 430, 60, 50));

        technetium.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                technetiumMouseClicked(evt);
            }
        });
        getContentPane().add(technetium, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 370, 60, 60));

        manganese.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                manganeseMouseClicked(evt);
            }
        });
        getContentPane().add(manganese, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 320, 60, 60));

        seaborgium.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                seaborgiumMouseClicked(evt);
            }
        });
        getContentPane().add(seaborgium, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 480, 50, 60));

        tungsten.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tungstenMouseClicked(evt);
            }
        });
        getContentPane().add(tungsten, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 430, 50, 50));

        molybdenum.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                molybdenumMouseClicked(evt);
            }
        });
        getContentPane().add(molybdenum, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 370, 50, 60));

        chromium.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                chromiumMouseClicked(evt);
            }
        });
        getContentPane().add(chromium, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 320, 50, 50));

        dubnium.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dubniumMouseClicked(evt);
            }
        });
        getContentPane().add(dubnium, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 480, 60, 60));

        tantalum.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tantalumMouseClicked(evt);
            }
        });
        getContentPane().add(tantalum, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 430, 60, 50));

        niobium.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                niobiumMouseClicked(evt);
            }
        });
        getContentPane().add(niobium, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 370, 60, 60));

        vanadium.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                vanadiumMouseClicked(evt);
            }
        });
        getContentPane().add(vanadium, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 320, 60, 50));

        rutherfordium.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rutherfordiumMouseClicked(evt);
            }
        });
        getContentPane().add(rutherfordium, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 480, 50, 60));

        hafnium.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                hafniumMouseClicked(evt);
            }
        });
        getContentPane().add(hafnium, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 430, 50, 50));

        zirconium.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                zirconiumMouseClicked(evt);
            }
        });
        getContentPane().add(zirconium, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 370, 50, 60));

        titanium.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                titaniumMouseClicked(evt);
            }
        });
        getContentPane().add(titanium, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 320, 50, 50));

        actinium.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                actiniumMouseClicked(evt);
            }
        });
        getContentPane().add(actinium, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 480, 60, 60));

        lanthanum.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lanthanumMouseClicked(evt);
            }
        });
        getContentPane().add(lanthanum, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 430, 60, 50));

        yttrium.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                yttriumMouseClicked(evt);
            }
        });
        getContentPane().add(yttrium, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 370, 60, 60));

        scandium.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                scandiumMouseClicked(evt);
            }
        });
        getContentPane().add(scandium, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 320, 60, 50));

        radium.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                radiumMouseClicked(evt);
            }
        });
        getContentPane().add(radium, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 480, 50, 60));

        barium.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bariumMouseClicked(evt);
            }
        });
        getContentPane().add(barium, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 430, 50, 50));

        strontium.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                strontiumMouseClicked(evt);
            }
        });
        getContentPane().add(strontium, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 370, 50, 60));

        calcium.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                calciumMouseClicked(evt);
            }
        });
        getContentPane().add(calcium, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 320, 50, 50));

        magnesium.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                magnesiumMouseClicked(evt);
            }
        });
        getContentPane().add(magnesium, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 260, 50, 60));

        beryllium.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                berylliumMouseClicked(evt);
            }
        });
        getContentPane().add(beryllium, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 210, 50, 50));

        francium.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                franciumMouseClicked(evt);
            }
        });
        getContentPane().add(francium, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 480, 60, 60));

        cesium.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cesiumMouseClicked(evt);
            }
        });
        getContentPane().add(cesium, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 430, 60, 50));

        rubidium.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rubidiumMouseClicked(evt);
            }
        });
        getContentPane().add(rubidium, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 370, 60, 60));

        potassium.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                potassiumMouseClicked(evt);
            }
        });
        getContentPane().add(potassium, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 320, 60, 50));

        sodium.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                sodiumMouseClicked(evt);
            }
        });
        getContentPane().add(sodium, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, 60, 60));

        hydrogen.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                hydrogenMouseClicked(evt);
            }
        });
        getContentPane().add(hydrogen, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, 60, 50));

        lithium.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lithiumMouseClicked(evt);
            }
        });
        getContentPane().add(lithium, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, 60, 50));

        lutetium.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lutetiumMouseClicked(evt);
            }
        });
        getContentPane().add(lutetium, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 560, 60, 60));

        ytterbium.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ytterbiumMouseClicked(evt);
            }
        });
        getContentPane().add(ytterbium, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 560, 60, 60));

        thulium.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                thuliumMouseClicked(evt);
            }
        });
        getContentPane().add(thulium, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 560, 60, 60));

        erbium.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                erbiumMouseClicked(evt);
            }
        });
        getContentPane().add(erbium, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 560, 60, 60));

        holmium.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                holmiumMouseClicked(evt);
            }
        });
        getContentPane().add(holmium, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 560, 60, 60));

        dysprosium.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dysprosiumMouseClicked(evt);
            }
        });
        getContentPane().add(dysprosium, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 560, 60, 60));

        terbium.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                terbiumMouseClicked(evt);
            }
        });
        getContentPane().add(terbium, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 560, 60, 60));

        gadolinium.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                gadoliniumMouseClicked(evt);
            }
        });
        getContentPane().add(gadolinium, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 560, 60, 60));

        europium.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                europiumMouseClicked(evt);
            }
        });
        getContentPane().add(europium, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 560, 60, 60));

        samarium.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                samariumMouseClicked(evt);
            }
        });
        getContentPane().add(samarium, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 560, 60, 60));

        promethium.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                promethiumMouseClicked(evt);
            }
        });
        getContentPane().add(promethium, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 560, 60, 60));

        neodymium.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                neodymiumMouseClicked(evt);
            }
        });
        getContentPane().add(neodymium, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 560, 60, 60));

        praseodymium.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                praseodymiumMouseClicked(evt);
            }
        });
        getContentPane().add(praseodymium, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 560, 60, 60));

        cerium.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ceriumMouseClicked(evt);
            }
        });
        getContentPane().add(cerium, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 560, 60, 60));

        lawrencium.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lawrenciumMouseClicked(evt);
            }
        });
        getContentPane().add(lawrencium, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 620, 50, 60));

        nobelium.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                nobeliumMouseClicked(evt);
            }
        });
        getContentPane().add(nobelium, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 620, 60, 60));

        mendelevium.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mendeleviumMouseClicked(evt);
            }
        });
        getContentPane().add(mendelevium, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 620, 50, 60));

        fermium.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                fermiumMouseClicked(evt);
            }
        });
        getContentPane().add(fermium, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 620, 60, 60));

        einsteinium.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                einsteiniumMouseClicked(evt);
            }
        });
        getContentPane().add(einsteinium, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 620, 50, 60));

        californium.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                californiumMouseClicked(evt);
            }
        });
        getContentPane().add(californium, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 620, 60, 60));

        berkelium.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                berkeliumMouseClicked(evt);
            }
        });
        getContentPane().add(berkelium, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 620, 60, 60));

        curium.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                curiumMouseClicked(evt);
            }
        });
        getContentPane().add(curium, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 620, 60, 60));

        americium.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                americiumMouseClicked(evt);
            }
        });
        getContentPane().add(americium, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 620, 60, 60));

        plutonium.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                plutoniumMouseClicked(evt);
            }
        });
        getContentPane().add(plutonium, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 620, 60, 60));

        neptunium.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                neptuniumMouseClicked(evt);
            }
        });
        getContentPane().add(neptunium, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 620, 60, 60));

        uranium.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                uraniumMouseClicked(evt);
            }
        });
        getContentPane().add(uranium, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 620, 60, 60));

        protactinium.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                protactiniumMouseClicked(evt);
            }
        });
        getContentPane().add(protactinium, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 620, 60, 60));

        thorium.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                thoriumMouseClicked(evt);
            }
        });
        getContentPane().add(thorium, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 620, 60, 60));

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Periodic Table.png"))); // NOI18N
        getContentPane().add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lithiumMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lithiumMouseClicked
        e.Lithium();
        title = "Lithium";
        showInformation();
    }//GEN-LAST:event_lithiumMouseClicked

    private void hydrogenMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_hydrogenMouseClicked
        e.Hydrogen();
        title = "Hydrogen";
        showInformation();
    }//GEN-LAST:event_hydrogenMouseClicked

    private void sodiumMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sodiumMouseClicked
        e.Sodium();
        title = "Sodium";
        showInformation();
    }//GEN-LAST:event_sodiumMouseClicked

    private void potassiumMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_potassiumMouseClicked
        e.Potassium();
        title = "Potassium";
        showInformation();
    }//GEN-LAST:event_potassiumMouseClicked

    private void rubidiumMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rubidiumMouseClicked
        e.Rubidium();
        title = "Rubidium";
        showInformation();
    }//GEN-LAST:event_rubidiumMouseClicked

    private void cesiumMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cesiumMouseClicked
        e.Cesium();
        title = "Cesium";
        showInformation();
    }//GEN-LAST:event_cesiumMouseClicked

    private void franciumMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_franciumMouseClicked
        e.Francium();
        title = "Francium";
        showInformation();
    }//GEN-LAST:event_franciumMouseClicked

    private void berylliumMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_berylliumMouseClicked
        e.Beryllium();
        title = "Beryllium";
        showInformation();
    }//GEN-LAST:event_berylliumMouseClicked

    private void magnesiumMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_magnesiumMouseClicked
        e.Magnesium();
        title = "Magnesium";
        showInformation();
    }//GEN-LAST:event_magnesiumMouseClicked

    private void calciumMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_calciumMouseClicked
        e.Calcium();
        title = "Calcium";
        showInformation();
    }//GEN-LAST:event_calciumMouseClicked

    private void strontiumMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_strontiumMouseClicked
        e.Strontium();
        title = "Strontium";
        showInformation();
    }//GEN-LAST:event_strontiumMouseClicked

    private void bariumMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bariumMouseClicked
        e.Barium();
        title = "Barium";
        showInformation();
    }//GEN-LAST:event_bariumMouseClicked

    private void radiumMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_radiumMouseClicked
        e.Radium();
        title = "Radium";
        showInformation();
    }//GEN-LAST:event_radiumMouseClicked

    private void scandiumMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_scandiumMouseClicked
        e.Scandium();
        title = "Scandium";
        showInformation();
    }//GEN-LAST:event_scandiumMouseClicked

    private void yttriumMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_yttriumMouseClicked
        e.Yttrium();
        title = "Yttrium";
        showInformation();
    }//GEN-LAST:event_yttriumMouseClicked

    private void lanthanumMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lanthanumMouseClicked
        e.Lanthanum();
        title = "Lanthanum";
        showInformation();
    }//GEN-LAST:event_lanthanumMouseClicked

    private void actiniumMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_actiniumMouseClicked
        e.Actinium();
        title = "Actinium";
        showInformation();
    }//GEN-LAST:event_actiniumMouseClicked

    private void titaniumMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_titaniumMouseClicked
        e.Titanium();
        title = "Titanium";
        showInformation();
    }//GEN-LAST:event_titaniumMouseClicked

    private void zirconiumMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_zirconiumMouseClicked
        e.Zirconium();
        title = "Zirconium";
        showInformation();
    }//GEN-LAST:event_zirconiumMouseClicked

    private void hafniumMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_hafniumMouseClicked
        e.Hafnium();
        title = "Hafnium";
        showInformation();
    }//GEN-LAST:event_hafniumMouseClicked

    private void rutherfordiumMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rutherfordiumMouseClicked
        e.Rutherfordium();
        title = "Rutherfordium";
        showInformation();
    }//GEN-LAST:event_rutherfordiumMouseClicked

    private void vanadiumMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_vanadiumMouseClicked
        e.Vanadium();
        title = "Vanadium";
        showInformation();
    }//GEN-LAST:event_vanadiumMouseClicked

    private void niobiumMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_niobiumMouseClicked
        e.Niobium();
        title = "Niobium";
        showInformation();
    }//GEN-LAST:event_niobiumMouseClicked

    private void tantalumMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tantalumMouseClicked
        e.Tantalum();
        title = "Tantalum";
        showInformation();
    }//GEN-LAST:event_tantalumMouseClicked

    private void dubniumMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dubniumMouseClicked
        e.Dubnium();
        title = "Dubnium";
        showInformation();
    }//GEN-LAST:event_dubniumMouseClicked

    private void chromiumMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_chromiumMouseClicked
        e.Chromium();
        title = "Chromium";
        showInformation();
    }//GEN-LAST:event_chromiumMouseClicked

    private void molybdenumMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_molybdenumMouseClicked
        e.Molybdenum();
        title = "Molybdenum";
        showInformation();
    }//GEN-LAST:event_molybdenumMouseClicked

    private void tungstenMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tungstenMouseClicked
        e.Tungsten();
        title = "Tungsten";
        showInformation();
    }//GEN-LAST:event_tungstenMouseClicked

    private void seaborgiumMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_seaborgiumMouseClicked
        e.Seaborgium();
        title = "Seaborgium";
        showInformation();
    }//GEN-LAST:event_seaborgiumMouseClicked

    private void manganeseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_manganeseMouseClicked
        e.Manganese();
        title = "Manganese";
        showInformation();
    }//GEN-LAST:event_manganeseMouseClicked

    private void technetiumMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_technetiumMouseClicked
        e.Technetium();
        title = "Technetium";
        showInformation();
    }//GEN-LAST:event_technetiumMouseClicked

    private void rheniumMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rheniumMouseClicked
        e.Rhenium();
        title = "Rhenium";
        showInformation();
    }//GEN-LAST:event_rheniumMouseClicked

    private void bohriumMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bohriumMouseClicked
        e.Bohrium();
        title = "Bohrium";
        showInformation();
    }//GEN-LAST:event_bohriumMouseClicked

    private void ironMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ironMouseClicked
        e.Iron();
        title = "Iron";
        showInformation();
    }//GEN-LAST:event_ironMouseClicked

    private void rutheniumMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rutheniumMouseClicked
        e.Ruthenium();
        title = "Ruthenium";
        showInformation();
    }//GEN-LAST:event_rutheniumMouseClicked

    private void osmiumMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_osmiumMouseClicked
        e.Osmium();
        title = "Osmium";
        showInformation();
    }//GEN-LAST:event_osmiumMouseClicked

    private void hassiumMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_hassiumMouseClicked
        e.Hassium();
        title = "Hassium";
        showInformation();
    }//GEN-LAST:event_hassiumMouseClicked

    private void cobaltMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cobaltMouseClicked
        e.Cobalt();
        title = "Cobalt";
        showInformation();
    }//GEN-LAST:event_cobaltMouseClicked

    private void rhodiumMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rhodiumMouseClicked
        e.Rhodium();
        title = "Rhodium";
        showInformation();
    }//GEN-LAST:event_rhodiumMouseClicked

    private void iridiumMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_iridiumMouseClicked
        e.Iridium();
        title = "Iridium";
        showInformation();
    }//GEN-LAST:event_iridiumMouseClicked

    private void meitneriumMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_meitneriumMouseClicked
        e.Meitnerium();
        title = "Meitnerium";
        showInformation();
    }//GEN-LAST:event_meitneriumMouseClicked

    private void nickelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nickelMouseClicked
        e.Nickel();
        title = "Nickel";
        showInformation();
    }//GEN-LAST:event_nickelMouseClicked

    private void palladiumMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_palladiumMouseClicked
        e.Palladium();
        title = "Palladium";
        showInformation();
    }//GEN-LAST:event_palladiumMouseClicked

    private void platinumMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_platinumMouseClicked
        e.Platinum();
        title = "Platinum";
        showInformation();
    }//GEN-LAST:event_platinumMouseClicked

    private void darmstadtiumMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_darmstadtiumMouseClicked
        e.Darmstadtium();
        title = "Darmstadtium";
        showInformation();
    }//GEN-LAST:event_darmstadtiumMouseClicked

    private void copperMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_copperMouseClicked
        e.Copper();
        title = "Copper";
        showInformation();
    }//GEN-LAST:event_copperMouseClicked

    private void silverMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_silverMouseClicked
        e.Silver();
        title = "Silver";
        showInformation();
    }//GEN-LAST:event_silverMouseClicked

    private void goldMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_goldMouseClicked
        e.Gold();
        title = "Gold";
        showInformation();
    }//GEN-LAST:event_goldMouseClicked

    private void roentgeniumMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_roentgeniumMouseClicked
        e.Roentgenium();
        title = "Roentgenium";
        showInformation();
    }//GEN-LAST:event_roentgeniumMouseClicked

    private void zincMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_zincMouseClicked
        e.Zinc();
        title = "Zinc";
        showInformation();
    }//GEN-LAST:event_zincMouseClicked

    private void cadmiumMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cadmiumMouseClicked
        e.Cadmium();
        title = "Cadmium";
        showInformation();
    }//GEN-LAST:event_cadmiumMouseClicked

    private void mercuryMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mercuryMouseClicked
        e.Mercury();
        title = "Mercury";
        showInformation();
    }//GEN-LAST:event_mercuryMouseClicked

    private void coperniciumMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_coperniciumMouseClicked
        e.Copernicium();
        title = "Copernicium";
        showInformation();
    }//GEN-LAST:event_coperniciumMouseClicked

    private void boronMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boronMouseClicked
        e.Boron();
        title = "Boron";
        showInformation();
    }//GEN-LAST:event_boronMouseClicked

    private void aluminumMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_aluminumMouseClicked
        e.Aluminum();
        title = "Aluminum";
        showInformation();
    }//GEN-LAST:event_aluminumMouseClicked

    private void galliumMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_galliumMouseClicked
        e.Gallium();
        title = "Gallium";
        showInformation();
    }//GEN-LAST:event_galliumMouseClicked

    private void indiumMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_indiumMouseClicked
        e.Indium();
        title = "Indium";
        showInformation();
    }//GEN-LAST:event_indiumMouseClicked

    private void thalliumMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_thalliumMouseClicked
        e.Thallium();
        title = "Thallium";
        showInformation();
    }//GEN-LAST:event_thalliumMouseClicked

    private void nihoniumMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nihoniumMouseClicked
        e.Nihonium();
        title = "Nihonium";
        showInformation();
    }//GEN-LAST:event_nihoniumMouseClicked

    private void carbonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_carbonMouseClicked
        e.Carbon();
        title = "Carbon";
        showInformation();
    }//GEN-LAST:event_carbonMouseClicked

    private void siliconMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_siliconMouseClicked
        e.Silicon();
        title = "Silicon";
        showInformation();
    }//GEN-LAST:event_siliconMouseClicked

    private void germaniumMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_germaniumMouseClicked
        e.Germanium();
        title = "Germanium";
        showInformation();
    }//GEN-LAST:event_germaniumMouseClicked

    private void tinMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tinMouseClicked
        e.Tin();
        title = "Tin";
        showInformation();
    }//GEN-LAST:event_tinMouseClicked

    private void leadMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_leadMouseClicked
        e.Lead();
        title = "Lead";
        showInformation();
    }//GEN-LAST:event_leadMouseClicked

    private void fleroviumMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fleroviumMouseClicked
        e.Flerovium();
        title = "Flerovium";
        showInformation();
    }//GEN-LAST:event_fleroviumMouseClicked

    private void nitrogenMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nitrogenMouseClicked
        e.Nitrogen();
        title = "Nitrogen";
        showInformation();
    }//GEN-LAST:event_nitrogenMouseClicked

    private void phosphorusMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_phosphorusMouseClicked
        e.Phosphorus();
        title = "Phosphorus";
        showInformation();
    }//GEN-LAST:event_phosphorusMouseClicked

    private void arsenicMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_arsenicMouseClicked
        e.Arsenic();
        title = "Arsenic";
        showInformation();
    }//GEN-LAST:event_arsenicMouseClicked

    private void antimonyMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_antimonyMouseClicked
        e.Antimony();
        title = "Antimony";
        showInformation();
    }//GEN-LAST:event_antimonyMouseClicked

    private void bismuthMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bismuthMouseClicked
        e.Bismuth();
        title = "Bismuth";
        showInformation();
    }//GEN-LAST:event_bismuthMouseClicked

    private void moscoviumMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_moscoviumMouseClicked
        e.Moscovium();
        title = "Moscovium";
        showInformation();
    }//GEN-LAST:event_moscoviumMouseClicked

    private void oxygenMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_oxygenMouseClicked
        e.Oxygen();
        title = "Oxygen";
        showInformation();
    }//GEN-LAST:event_oxygenMouseClicked

    private void sulfurMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sulfurMouseClicked
        e.Sulfur();
        title = "Sulfur";
        showInformation();
    }//GEN-LAST:event_sulfurMouseClicked

    private void seleniumMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_seleniumMouseClicked
        e.Selenium();
        title = "Selenium";
        showInformation();
    }//GEN-LAST:event_seleniumMouseClicked

    private void telluriumMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_telluriumMouseClicked
        e.Tellurium();
        title = "Tellurium";
        showInformation();
    }//GEN-LAST:event_telluriumMouseClicked

    private void poloniumMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_poloniumMouseClicked
        e.Polonium();
        title = "Polonium";
        showInformation();
    }//GEN-LAST:event_poloniumMouseClicked

    private void livermoriumMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_livermoriumMouseClicked
        e.Livermorium();
        title = "Livermorium";
        showInformation();
    }//GEN-LAST:event_livermoriumMouseClicked

    private void flourineMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_flourineMouseClicked
        e.Flourine();
        title = "Flourine";
        showInformation();
    }//GEN-LAST:event_flourineMouseClicked

    private void chlorineMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_chlorineMouseClicked
        e.Chlorine();
        title = "Chlorine";
        showInformation();
    }//GEN-LAST:event_chlorineMouseClicked

    private void bromineMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bromineMouseClicked
        e.Bromine();
        title = "Bromine";
        showInformation();
    }//GEN-LAST:event_bromineMouseClicked

    private void iodineMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_iodineMouseClicked
        e.Iodine();
        title = "Iodine";
        showInformation();
    }//GEN-LAST:event_iodineMouseClicked

    private void astatineMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_astatineMouseClicked
        e.Astatine();
        title = "Astatine";
        showInformation();
    }//GEN-LAST:event_astatineMouseClicked

    private void tennessineMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tennessineMouseClicked
        e.Tennessine();
        title = "Tennessine";
        showInformation();
    }//GEN-LAST:event_tennessineMouseClicked

    private void heliumMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_heliumMouseClicked
        e.Helium();
        title = "Helium";
        showInformation();
    }//GEN-LAST:event_heliumMouseClicked

    private void neonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_neonMouseClicked
        e.Neon();
        title = "Neon";
        showInformation();
    }//GEN-LAST:event_neonMouseClicked

    private void argonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_argonMouseClicked
        e.Argon();
        title = "Argon";
        showInformation();
    }//GEN-LAST:event_argonMouseClicked

    private void kryptonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_kryptonMouseClicked
        e.Krypton();
        title = "Krypton";
        showInformation();
    }//GEN-LAST:event_kryptonMouseClicked

    private void xenonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_xenonMouseClicked
        e.Xenon();
        title = "Xenon";
        showInformation();
    }//GEN-LAST:event_xenonMouseClicked

    private void radonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_radonMouseClicked
        e.Radon();
        title = "Radon";
        showInformation();
    }//GEN-LAST:event_radonMouseClicked

    private void oganessonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_oganessonMouseClicked
        e.Oganesson();
        title = "Oganesson";
        showInformation();
    }//GEN-LAST:event_oganessonMouseClicked

    private void ceriumMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ceriumMouseClicked
        e.Cerium();
        title = "Cerium";
        showInformation();
    }//GEN-LAST:event_ceriumMouseClicked

    private void praseodymiumMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_praseodymiumMouseClicked
        e.Praseodymium();
        title = "Praseodymium";
        showInformation();
    }//GEN-LAST:event_praseodymiumMouseClicked

    private void neodymiumMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_neodymiumMouseClicked
        e.Neodymium();
        title = "Neodymium";
        showInformation();
    }//GEN-LAST:event_neodymiumMouseClicked

    private void promethiumMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_promethiumMouseClicked
        e.Promethium();
        title = "Promethium";
        showInformation();
    }//GEN-LAST:event_promethiumMouseClicked

    private void samariumMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_samariumMouseClicked
        e.Samarium();
        title = "Samarium";
        showInformation();
    }//GEN-LAST:event_samariumMouseClicked

    private void europiumMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_europiumMouseClicked
        e.Europium();
        title = "Europium";
        showInformation();
    }//GEN-LAST:event_europiumMouseClicked

    private void gadoliniumMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_gadoliniumMouseClicked
        e.Gadolinium();
        title = "Gadolinium";
        showInformation();
    }//GEN-LAST:event_gadoliniumMouseClicked

    private void terbiumMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_terbiumMouseClicked
        e.Terbium();
        title = "Terbium";
        showInformation();
    }//GEN-LAST:event_terbiumMouseClicked

    private void dysprosiumMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dysprosiumMouseClicked
        e.Dysprosium();
        title = "Dysprosium";
        showInformation();
    }//GEN-LAST:event_dysprosiumMouseClicked

    private void holmiumMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_holmiumMouseClicked
        e.Holmium();
        title = "Holmium";
        showInformation();
    }//GEN-LAST:event_holmiumMouseClicked

    private void erbiumMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_erbiumMouseClicked
        e.Erbium();
        title = "Erbium";
        showInformation();
    }//GEN-LAST:event_erbiumMouseClicked

    private void thuliumMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_thuliumMouseClicked
        e.Thulium();
        title = "Thulium";
        showInformation();
    }//GEN-LAST:event_thuliumMouseClicked

    private void ytterbiumMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ytterbiumMouseClicked
        e.Ytterbium();
        title = "Ytterbium";
        showInformation();
    }//GEN-LAST:event_ytterbiumMouseClicked

    private void lutetiumMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lutetiumMouseClicked
        e.Lutetium();
        title = "Lutetium";
        showInformation();
    }//GEN-LAST:event_lutetiumMouseClicked

    private void thoriumMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_thoriumMouseClicked
        e.Thorium();
        title = "Thorium";
        showInformation();
    }//GEN-LAST:event_thoriumMouseClicked

    private void protactiniumMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_protactiniumMouseClicked
        e.Protactinium();
        title = "Protactinium";
        showInformation();
    }//GEN-LAST:event_protactiniumMouseClicked

    private void uraniumMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_uraniumMouseClicked
        e.Uranium();
        title = "Uranium";
        showInformation();
    }//GEN-LAST:event_uraniumMouseClicked

    private void neptuniumMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_neptuniumMouseClicked
        e.Neptunium();
        title = "Neptunium";
        showInformation();
    }//GEN-LAST:event_neptuniumMouseClicked

    private void plutoniumMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_plutoniumMouseClicked
        e.Plutonium();
        title = "Plutonium";
        showInformation();
    }//GEN-LAST:event_plutoniumMouseClicked

    private void americiumMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_americiumMouseClicked
        e.Americium();
        title = "Americium";
        showInformation();
    }//GEN-LAST:event_americiumMouseClicked

    private void curiumMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_curiumMouseClicked
        e.Curium();
        title = "Curium";
        showInformation();
    }//GEN-LAST:event_curiumMouseClicked

    private void berkeliumMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_berkeliumMouseClicked
        e.Berkelium();
        title = "Berkelium";
        showInformation();
    }//GEN-LAST:event_berkeliumMouseClicked

    private void californiumMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_californiumMouseClicked
        e.Californium();
        title = "Californium";
        showInformation();
    }//GEN-LAST:event_californiumMouseClicked

    private void einsteiniumMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_einsteiniumMouseClicked
        e.Einsteinium();
        title = "Einsteinium";
        showInformation();
    }//GEN-LAST:event_einsteiniumMouseClicked

    private void fermiumMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fermiumMouseClicked
        e.Fermium();
        title = "Fermium";
        showInformation();
    }//GEN-LAST:event_fermiumMouseClicked

    private void mendeleviumMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mendeleviumMouseClicked
        e.Mendelevium();
        title = "Mendelevium";
        showInformation();
    }//GEN-LAST:event_mendeleviumMouseClicked

    private void nobeliumMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nobeliumMouseClicked
        e.Nobelium();
        title = "Nobelium";
        showInformation();
    }//GEN-LAST:event_nobeliumMouseClicked

    private void lawrenciumMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lawrenciumMouseClicked
        e.Lawrencium();
        title = "Lawrencium";
        showInformation();
    }//GEN-LAST:event_lawrenciumMouseClicked

    private void showInformation(){
        JOptionPane.showMessageDialog(null,"<html><font size='5'>" + e.information + "</font></html>", title, JOptionPane.INFORMATION_MESSAGE);
    }
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
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel actinium;
    private javax.swing.JLabel aluminum;
    private javax.swing.JLabel americium;
    private javax.swing.JLabel antimony;
    private javax.swing.JLabel argon;
    private javax.swing.JLabel arsenic;
    private javax.swing.JLabel astatine;
    private javax.swing.JLabel background;
    private javax.swing.JLabel barium;
    private javax.swing.JLabel berkelium;
    private javax.swing.JLabel beryllium;
    private javax.swing.JLabel bismuth;
    private javax.swing.JLabel bohrium;
    private javax.swing.JLabel boron;
    private javax.swing.JLabel bromine;
    private javax.swing.JLabel cadmium;
    private javax.swing.JLabel calcium;
    private javax.swing.JLabel californium;
    private javax.swing.JLabel carbon;
    private javax.swing.JLabel cerium;
    private javax.swing.JLabel cesium;
    private javax.swing.JLabel chlorine;
    private javax.swing.JLabel chromium;
    private javax.swing.JLabel cobalt;
    private javax.swing.JLabel copernicium;
    private javax.swing.JLabel copper;
    private javax.swing.JLabel curium;
    private javax.swing.JLabel darmstadtium;
    private javax.swing.JLabel dubnium;
    private javax.swing.JLabel dysprosium;
    private javax.swing.JLabel einsteinium;
    private javax.swing.JLabel erbium;
    private javax.swing.JLabel europium;
    private javax.swing.JLabel fermium;
    private javax.swing.JLabel flerovium;
    private javax.swing.JLabel flourine;
    private javax.swing.JLabel francium;
    private javax.swing.JLabel gadolinium;
    private javax.swing.JLabel gallium;
    private javax.swing.JLabel germanium;
    private javax.swing.JLabel gold;
    private javax.swing.JLabel hafnium;
    private javax.swing.JLabel hassium;
    private javax.swing.JLabel helium;
    private javax.swing.JLabel holmium;
    private javax.swing.JLabel hydrogen;
    private javax.swing.JLabel indium;
    private javax.swing.JLabel iodine;
    private javax.swing.JLabel iridium;
    private javax.swing.JLabel iron;
    private javax.swing.JLabel krypton;
    private javax.swing.JLabel lanthanum;
    private javax.swing.JLabel lawrencium;
    private javax.swing.JLabel lead;
    private javax.swing.JLabel lithium;
    private javax.swing.JLabel livermorium;
    private javax.swing.JLabel lutetium;
    private javax.swing.JLabel magnesium;
    private javax.swing.JLabel manganese;
    private javax.swing.JLabel meitnerium;
    private javax.swing.JLabel mendelevium;
    private javax.swing.JLabel mercury;
    private javax.swing.JLabel molybdenum;
    private javax.swing.JLabel moscovium;
    private javax.swing.JLabel neodymium;
    private javax.swing.JLabel neon;
    private javax.swing.JLabel neptunium;
    private javax.swing.JLabel nickel;
    private javax.swing.JLabel nihonium;
    private javax.swing.JLabel niobium;
    private javax.swing.JLabel nitrogen;
    private javax.swing.JLabel nobelium;
    private javax.swing.JLabel oganesson;
    private javax.swing.JLabel osmium;
    private javax.swing.JLabel oxygen;
    private javax.swing.JLabel palladium;
    private javax.swing.JLabel phosphorus;
    private javax.swing.JLabel platinum;
    private javax.swing.JLabel plutonium;
    private javax.swing.JLabel polonium;
    private javax.swing.JLabel potassium;
    private javax.swing.JLabel praseodymium;
    private javax.swing.JLabel promethium;
    private javax.swing.JLabel protactinium;
    private javax.swing.JLabel radium;
    private javax.swing.JLabel radon;
    private javax.swing.JLabel rhenium;
    private javax.swing.JLabel rhodium;
    private javax.swing.JLabel roentgenium;
    private javax.swing.JLabel rubidium;
    private javax.swing.JLabel ruthenium;
    private javax.swing.JLabel rutherfordium;
    private javax.swing.JLabel samarium;
    private javax.swing.JLabel scandium;
    private javax.swing.JLabel seaborgium;
    private javax.swing.JLabel selenium;
    private javax.swing.JLabel silicon;
    private javax.swing.JLabel silver;
    private javax.swing.JLabel sodium;
    private javax.swing.JLabel strontium;
    private javax.swing.JLabel sulfur;
    private javax.swing.JLabel tantalum;
    private javax.swing.JLabel technetium;
    private javax.swing.JLabel tellurium;
    private javax.swing.JLabel tennessine;
    private javax.swing.JLabel terbium;
    private javax.swing.JLabel thallium;
    private javax.swing.JLabel thorium;
    private javax.swing.JLabel thulium;
    private javax.swing.JLabel tin;
    private javax.swing.JLabel titanium;
    private javax.swing.JLabel tungsten;
    private javax.swing.JLabel uranium;
    private javax.swing.JLabel vanadium;
    private javax.swing.JLabel xenon;
    private javax.swing.JLabel ytterbium;
    private javax.swing.JLabel yttrium;
    private javax.swing.JLabel zinc;
    private javax.swing.JLabel zirconium;
    // End of variables declaration//GEN-END:variables
}
