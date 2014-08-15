/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.blinz117;

import java.util.Random;

/**
 *
 * @author Bryan
 */
public class StoryIdeaGenerator extends javax.swing.JFrame {

// TODO: Eventually, I want to move all of these to external files, so they
// will be easy to modify, or load in completely different or multiple files

    private static final String[] genreList = {
        "action",
        "romance",
        "drama",
        "comedy",
        "horror",
        "mystery",
        "science fiction",
        "fantasy",
        "dark",
        "western",
        "children's",
        "philosophical",
        "fairy tale",
        "noir",
        "art",
        "survival",
        "romantic comedy",
        "tragedy",
        "historical",
        "thriller",
        "feel-good",
        "psychological",
        "superhero",
        "spy",
        //"erotic", // Hmmm... need to be careful about this one... what if you get child or animal as character?
        "epic",
        "cute",
        "surrealist",
        "martial arts",
        "crime",
        "political",
        "utopian/dystopian",
        "adventure",
        "war"
    };
    
    public static final String[] settingList = {
        "home",
        "space",
        "wild west",
        "forest",
        "candy land",
        "city",
        "farm",
        "museum",
        "ancient temple",
        "office",
        "Middle East",
        "Africa",
        "Asia",
        "cyberspace",
        "underground",
        "stadium",
        "mountains",
        "river",
        "ocean",
        "alien planet",
        "cave",
        "castle",
        "school",
        "bar",
        "cafe",
        "prison",
        "hospital",
        "dungeon",
        "laboratory",
        "Europe",
        "battlefield",
        "cabin",
        "desert",
        "restaurant",
        "plane",
        "church",
        "island",
        "nowhere",
        "nature",
        "cemetary",
        "volcano",
        "fantasy world",
        "alternate universe",
        "wilderness",
        "sky",
        "kitchen",
        "party",
        "store",
        "beach",
        "apartment",
        "future",
        "past",
        "present day",
        "apocalyptic wasteland",
        "arctic",
        "disaster site",
        "afterlife",
        "North America",
        "South America",
        "Australia",
        "jungle",
        "small town",
        "village",
        "zoo"
    };
    
    private static final String[] charTypeList = {
        "average man",
        "average woman",
        "robot",
        "lawyer",
        "animal",
        "inanimate object",
        "doctor",
        "astronaut",
        "police officer",
        "fugitive",
        "teenager",
        "child",
        "dog",
        "cat",
        "horse",
        "student",
        "husband",
        "wife",
        "office worker",
        "manager",
        "government official",
        "parent",
        "waiter",
        "unemployed",
        "chef",
        "alien",
        "musician",
        "computer programmer",
        "military personnel",
        "pilot",
        "artist",
        "warrior",
        "celebrity",
        "mythological creature",
        "lover",
        "monster",
        "genius",
        "nerd",
        "wizard",
        "construction worker",
        "hero",
        "villain",
        "athlete",
        "criminal",
        "office worker",
        "plant",
        "insect",
        "boy",
        "girl",
        "anonymous",
        "deity",
        "pirate",
        "cowboy",
        "rebel",
        "artificial intelligence",
        "imaginary being",
        "time traveller",
        "scientist",
        "coach",
        "teacher",
        "employee",
        "business owner",
        "engineer",
        "personification of abstract concept",
        "politician",
        "bird",
        "performer",
        "minority"
    };
    
    private static final String[] charAttrList = {
        "happy",
        "angry",
        "sad",
        "scared",
        "manic",
        "depressed",
        "lonely",
        "vindictive",
        "neurotic",
        "self-loathing",
        "short-tempered",
        "unstable",
        "prideful",
        "mellow",
        "talented",
        "hysterical",
        "disgruntled",
        "rich",
        "poor",
        "hard-working",
        "narcissistic",
        "optimistic",
        "evil",
        "heroic",
        "artistic",
        "tall",
        "short",
        "attractive",
        "disgifured",
        "handicapped",
        "thin",
        "overweight",
        "strong",
        "frail",
        "average",
        "loud",
        "soft-spoken",
        "rebellious",
        "energetic",
        "lethargic",
        "scatter-brained",
        "negligent",
        "accident-prone",
        "lucky",
        "cute",
        "old",
        "young",
        "power-hungry",
        "self-centered",
        "ignorant",
        "intelligent",
        "blind",
        "helpful",
        "self-sacrificing",
        "humble",
        "self-conscious",
        "sick",
        "creative",
        "motivated",
        "daredevil",
        "magical",
        "gifted",
        "nervous",
        "trustowrthy",
        "honest",
        "dishonest",
        "organized",
        "messy",
        "focused",
        "determined",
        "scary",
        "friendly",
        "popular",
        "hated",
        "psychic"
    };
    
    public static final String[] motivationList = {
        "love",
        "greed",
        "laziness",
        "desire to win",
        "revenge",
        "self-improvement",
        "growing up",
        "growing old",
        "fear of death",
        "saving lives",
        "imprisonment",
        "escape",
        "passion",
        "romance",
        "selfishness",
        "creativity",
        "hunger",
        "anger",
        "loss",
        "work",
        "family",
        "companionship",
        "heartbreak",
        "home",
        "safety",
        "lost",
        "illness",
        "death",
        "recognition",
        "fear",
        "temptation",
        "lust",
        "loneliness",
        "power",
        "duty",
        "complacency",
        "boredom",
        "reward",
        "competition",
        "redemption",
        "self discovery",
        "overcoming fear",
        "justice",
        "secret",
        "recovery",
        "nostalgia",
        "finding love",
        "becoming the best",
        "false hope",
        "hope",
        "insanity",
        "religion",
        "faith",
        "survival",
        "depression",
        "addiction",
        "running out of time",
        "acceptance",
        "exploration"
    };
    
    private Random rand = new Random();
    
    /**
     * Creates new form MainFrame
     */
    public StoryIdeaGenerator() {
        initComponents();
    }
    
    public String[] getGenreList()  { return genreList; }
    
    public String[] getSettingList() { return settingList; }
    
    public String[] getCharTypeList() { return charTypeList; }
    
    public String[] getCharAttrList() { return charAttrList; }
    
    public String[] getMotivationList() { return motivationList; }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        comboSetting = new javax.swing.JComboBox();
        comboGenre = new javax.swing.JComboBox();
        promptGenre = new javax.swing.JLabel();
        promptSetting = new javax.swing.JLabel();
        buttonGenerate = new javax.swing.JButton();
        promptCharType = new javax.swing.JLabel();
        comboCharType = new javax.swing.JComboBox();
        comboCharAttr = new javax.swing.JComboBox();
        promptCharAttr = new javax.swing.JLabel();
        promptMotivation = new javax.swing.JLabel();
        comboMotivation = new javax.swing.JComboBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        comboSetting.setModel(new javax.swing.DefaultComboBoxModel(getSettingList()));

        comboGenre.setModel(new javax.swing.DefaultComboBoxModel(getGenreList()));

        promptGenre.setText("Genre");

        promptSetting.setText("Setting");

        buttonGenerate.setText("Generate");
        buttonGenerate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonGenerateActionPerformed(evt);
            }
        });

        promptCharType.setText("Character");

        comboCharType.setModel(new javax.swing.DefaultComboBoxModel(getCharTypeList()));

        comboCharAttr.setModel(new javax.swing.DefaultComboBoxModel(getCharAttrList()));

        promptCharAttr.setText("Character Attribute");

        promptMotivation.setText("Character Motivation");

        comboMotivation.setModel(new javax.swing.DefaultComboBoxModel(getMotivationList()));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(buttonGenerate, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(promptGenre)
                    .addComponent(promptSetting)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(comboSetting, javax.swing.GroupLayout.Alignment.LEADING, 0, 203, Short.MAX_VALUE)
                        .addComponent(comboGenre, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(comboCharType, 0, 236, Short.MAX_VALUE)
                    .addComponent(comboCharAttr, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(comboMotivation, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(promptCharType)
                        .addComponent(promptCharAttr)
                        .addComponent(promptMotivation)))
                .addGap(5, 5, 5))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(promptCharType)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(comboCharType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(promptCharAttr)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(comboCharAttr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(promptGenre)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(comboGenre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(promptSetting)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(comboSetting, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(buttonGenerate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(promptMotivation)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(comboMotivation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(30, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonGenerateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonGenerateActionPerformed
        // TODO add your handling code here:
        comboGenre.setSelectedIndex(rand.nextInt(comboGenre.getItemCount()));
        comboSetting.setSelectedIndex(rand.nextInt(comboSetting.getItemCount()));
        comboCharType.setSelectedIndex(rand.nextInt(comboCharType.getItemCount()));
        comboCharAttr.setSelectedIndex(rand.nextInt(comboCharAttr.getItemCount()));
        comboMotivation.setSelectedIndex(rand.nextInt(comboMotivation.getItemCount()));
    }//GEN-LAST:event_buttonGenerateActionPerformed

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
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
            javax.swing.UIManager.setLookAndFeel(javax.swing.UIManager.getSystemLookAndFeelClassName());
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(StoryIdeaGenerator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StoryIdeaGenerator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StoryIdeaGenerator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StoryIdeaGenerator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StoryIdeaGenerator().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonGenerate;
    private javax.swing.JComboBox comboCharAttr;
    private javax.swing.JComboBox comboCharType;
    private javax.swing.JComboBox comboGenre;
    private javax.swing.JComboBox comboMotivation;
    private javax.swing.JComboBox comboSetting;
    private javax.swing.JLabel promptCharAttr;
    private javax.swing.JLabel promptCharType;
    private javax.swing.JLabel promptGenre;
    private javax.swing.JLabel promptMotivation;
    private javax.swing.JLabel promptSetting;
    // End of variables declaration//GEN-END:variables
}
