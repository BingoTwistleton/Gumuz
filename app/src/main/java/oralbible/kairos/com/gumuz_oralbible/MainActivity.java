package oralbible.kairos.com.gumuz_oralbible;

public class MainActivity extends android.support.v7.app.AppCompatActivity {

    public static final String FILETITLE = "gumuz_oralbible.kairos.com.gumuz_oralbible.FILETITLE";
    public static final String AUDIO_FILE = "gumuz_oralbible.kairos.com.gumuz_oralbible.AUDIO_FILE";

    @Override
    protected void onCreate(android.os.Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Called when the user taps the Send button
     */
    public void sendMessage(android.view.View view) {

        android.content.Intent intent = new android.content.Intent(this, PlaySound.class);

        /*
        script process.pl to generate else/if sequence and buttons in activity_main.xml
                 is in /home/brad/kairosrecordings
        */


        if (view.getId() == R.id.button01) {
            String message = "1 ዘፍጥረት";
            String filename = "a01_creation_gumuz_2013";
            intent.putExtra(FILETITLE, message);
            intent.putExtra(AUDIO_FILE, filename);
            startActivity(intent);
        }

        else if (view.getId() == R.id.button02) {
            String message = "2 የዘፍጥረት መዝሙር";
            String filename = "a02_songcreation_gumuz_2013";
            intent.putExtra(FILETITLE, message);
            intent.putExtra(AUDIO_FILE, filename);
            startActivity(intent);
        }

        else if (view.getId() == R.id.button03) {
            String message = "3 አዳምና ሔዋን";
            String filename = "a03_adameve_gumuz_2013_0";
            intent.putExtra(FILETITLE, message);
            intent.putExtra(AUDIO_FILE, filename);
            startActivity(intent);
        }

        else if (view.getId() == R.id.button04) {
            String message = "4 የሰው ውድቀት";
            String filename = "a04_fall_gumuz_2013_0";
            intent.putExtra(FILETITLE, message);
            intent.putExtra(AUDIO_FILE, filename);
            startActivity(intent);
        }

        else if (view.getId() == R.id.button05) {
            String message = "5 ሁሉም በደሉ";
            String filename = "a05_allhavesinned_gumuz_2013_0";
            intent.putExtra(FILETITLE, message);
            intent.putExtra(AUDIO_FILE, filename);
            startActivity(intent);
        }

        else if (view.getId() == R.id.button06) {
            String message = "6 አቤል እና ቃየን";
            String filename = "a06_cainabel_gumuz_2013_0";
            intent.putExtra(FILETITLE, message);
            intent.putExtra(AUDIO_FILE, filename);
            startActivity(intent);
        }

        else if (view.getId() == R.id.button07) {
            String message = "7 አቤል እና ቃየን መዝሙር";
            String filename = "a07_songcainabel_gumuz_2013_0";
            intent.putExtra(FILETITLE, message);
            intent.putExtra(AUDIO_FILE, filename);
            startActivity(intent);
        }

        else if (view.getId() == R.id.button08) {
            String message = "8 አቤል እና ቃየን የሴቶች መዝሙር";
            String filename = "a08_womansongcainabel_gumuz_2013_0";
            intent.putExtra(FILETITLE, message);
            intent.putExtra(AUDIO_FILE, filename);
            startActivity(intent);
        }

        else if (view.getId() == R.id.button09) {
            String message = "9 ኖህ";
            String filename = "a09_noah_gumuz_2013_0";
            intent.putExtra(FILETITLE, message);
            intent.putExtra(AUDIO_FILE, filename);
            startActivity(intent);
        }

        else if (view.getId() == R.id.button10) {
            String message = "10 ኖህ መዝሙር";
            String filename = "a10_songnoah_gumuz_2013_0";
            intent.putExtra(FILETITLE, message);
            intent.putExtra(AUDIO_FILE, filename);
            startActivity(intent);
        }

        else if (view.getId() == R.id.button11) {
            String message = "11 ሳይጣን";
            String filename = "a11_lucifersatan_gumuz_2013_0";
            intent.putExtra(FILETITLE, message);
            intent.putExtra(AUDIO_FILE, filename);
            startActivity(intent);
        }

        else if (view.getId() == R.id.button12) {
            String message = "12 የአብርሃም ቃልኪዳን";
            String filename = "a12_abrahamcovenant_gumuz_2013_0";
            intent.putExtra(FILETITLE, message);
            intent.putExtra(AUDIO_FILE, filename);
            startActivity(intent);
        }

        else if (view.getId() == R.id.button13) {
            String message = "13 የአብርሃም መጠራት";
            String filename = "a13_callabrahamsong_gumuz_2013_0";
            intent.putExtra(FILETITLE, message);
            intent.putExtra(AUDIO_FILE, filename);
            startActivity(intent);
        }

        else if (view.getId() == R.id.button14) {
            String message = "14 ሳራና አጋር";
            String filename = "a14_sarahhagar_gumuz_2013_0";
            intent.putExtra(FILETITLE, message);
            intent.putExtra(AUDIO_FILE, filename);
            startActivity(intent);
        }

        else if (view.getId() == R.id.button15) {
            String message = "15 የይስሃቅ ቃልኪዳን";
            String filename = "a15_promiseisaac_gumuz_2013_0";
            intent.putExtra(FILETITLE, message);
            intent.putExtra(AUDIO_FILE, filename);
            startActivity(intent);
        }

        else if (view.getId() == R.id.button16) {
            String message = "16 አብርሃምና ይስሃቅ";
            String filename = "a16_abrahamisaac_gumuz_2013_0";
            intent.putExtra(FILETITLE, message);
            intent.putExtra(AUDIO_FILE, filename);
            startActivity(intent);
        }

        else if (view.getId() == R.id.button17) {
            String message = "17 በፈተና መደሰት";
            String filename = "a17_joyfultrial_gumuz_2013_0";
            intent.putExtra(FILETITLE, message);
            intent.putExtra(AUDIO_FILE, filename);
            startActivity(intent);
        }

        else if (view.getId() == R.id.button18) {
            String message = "18 ያእቆብ በረከትን ሰረቀ";
            String filename = "a18_jacobstolenblessing_gumuz_2013_0";
            intent.putExtra(FILETITLE, message);
            intent.putExtra(AUDIO_FILE, filename);
            startActivity(intent);
        }

        else if (view.getId() == R.id.button19) {
            String message = "19 ያእቆብና ኤሳው ታረቁ";
            String filename = "a19_jacobeasureconcile_gumuz_2013_0";
            intent.putExtra(FILETITLE, message);
            intent.putExtra(AUDIO_FILE, filename);
            startActivity(intent);
        }

        else if (view.getId() == R.id.button20) {
            String message = "20 ዮሴፍ ህልም አየ";
            String filename = "a20_josephdreamer_gumuz_2013_0";
            intent.putExtra(FILETITLE, message);
            intent.putExtra(AUDIO_FILE, filename);
            startActivity(intent);
        }

        else if (view.getId() == R.id.button21) {
            String message = "21 የሴቶች መዝሙር ስለዮሴፍ";
            String filename = "a21_womenjosephsong_gumuz_2013_0";
            intent.putExtra(FILETITLE, message);
            intent.putExtra(AUDIO_FILE, filename);
            startActivity(intent);
        }

        else if (view.getId() == R.id.button22) {
            String message = "22 ዮሴፍ ነገሰ";
            String filename = "a22_josephgovernor_gumuz_2013";
            intent.putExtra(FILETITLE, message);
            intent.putExtra(AUDIO_FILE, filename);
            startActivity(intent);
        }

        else if (view.getId() == R.id.button23) {
            String message = "23 ሙሴ እና የእሳት ቁጥቋጦ";
            String filename = "a23_mosesburningbush_gumuz_2013_0";
            intent.putExtra(FILETITLE, message);
            intent.putExtra(AUDIO_FILE, filename);
            startActivity(intent);
        }

        else if (view.getId() == R.id.button24) {
            String message = "24 ፋሲካ ";
            String filename = "a24_passover_gumuz_2013_0";
            intent.putExtra(FILETITLE, message);
            intent.putExtra(AUDIO_FILE, filename);
            startActivity(intent);
        }

        else if (view.getId() == R.id.button25) {
            String message = "25 የፋሲካ በግ";
            String filename = "a25_songpassoverlamb_gumuz_2013_0";
            intent.putExtra(FILETITLE, message);
            intent.putExtra(AUDIO_FILE, filename);
            startActivity(intent);
        }

        else if (view.getId() == R.id.button26) {
            String message = "26 10ቱ ትዛዛት";
            String filename = "a26_tencommandements_gumuz_2013_0";
            intent.putExtra(FILETITLE, message);
            intent.putExtra(AUDIO_FILE, filename);
            startActivity(intent);
        }

        else if (view.getId() == R.id.button27) {
            String message = "27 ስለ 10ቱ ትዛዛት መዝሙር";
            String filename = "a27_songcommandments_gumuz_2013";
            intent.putExtra(FILETITLE, message);
            intent.putExtra(AUDIO_FILE, filename);
            startActivity(intent);
        }

        else if (view.getId() == R.id.button28) {
            String message = "28 ሰላዮች";
            String filename = "a28_spies_gumuz_2013_0";
            intent.putExtra(FILETITLE, message);
            intent.putExtra(AUDIO_FILE, filename);
            startActivity(intent);
        }

        else if (view.getId() == R.id.button29) {
            String message = "29 ስለ ሰላዮች መዝሙር";
            String filename = "a29_spiesgrumblingsong_gumuz_2013_0";
            intent.putExtra(FILETITLE, message);
            intent.putExtra(AUDIO_FILE, filename);
            startActivity(intent);
        }

        else if (view.getId() == R.id.button30) {
            String message = "30 ዮርዳኖስ ዎንዝን ማቋረጥ";
            String filename = "a30_crossingjordan_gumuz_2013_0";
            intent.putExtra(FILETITLE, message);
            intent.putExtra(AUDIO_FILE, filename);
            startActivity(intent);
        }

        else if (view.getId() == R.id.button31) {
            String message = "31 ጌታን ማመስገን";
            String filename = "a31_praiselord_gumuz_2013";
            intent.putExtra(FILETITLE, message);
            intent.putExtra(AUDIO_FILE, filename);
            startActivity(intent);
        }

        else if (view.getId() == R.id.button32) {
            String message = "32 ጠላቶቻችንን ስለመውደድ መዝሙር";
            String filename = "a32_songloveyourenemies_gumuz_2013";
            intent.putExtra(FILETITLE, message);
            intent.putExtra(AUDIO_FILE, filename);
            startActivity(intent);
        }

        else if (view.getId() == R.id.button33) {
            String message = "33 የኢየሱስ መወለድ";
            String filename = "a33_birthjesus_gumuz_2013_0";
            intent.putExtra(FILETITLE, message);
            intent.putExtra(AUDIO_FILE, filename);
            startActivity(intent);
        }

        else if (view.getId() == R.id.button34) {
            String message = "34 የኢየሱስ ጥምቀት";
            String filename = "a34_baptismjesus_gumuz_2013_0";
            intent.putExtra(FILETITLE, message);
            intent.putExtra(AUDIO_FILE, filename);
            startActivity(intent);
        }

        else if (view.getId() == R.id.button35) {
            String message = "35 የመጀመሪያዎቹ ደቀመዛሙርት";
            String filename = "a35_firstdisciples_gumuz_2013_0";
            intent.putExtra(FILETITLE, message);
            intent.putExtra(AUDIO_FILE, filename);
            startActivity(intent);
        }

        else if (view.getId() == R.id.button36) {
            String message = "36 የሚጥል በሽታ ያለበት  ሰው";
            String filename = "a36_paralytic_gumuz_2013_0";
            intent.putExtra(FILETITLE, message);
            intent.putExtra(AUDIO_FILE, filename);
            startActivity(intent);
        }

        else if (view.getId() == R.id.button37) {
            String message = "37 የዘሪው ምሳሌ";
            String filename = "a37_sower_gumuz_2013_0";
            intent.putExtra(FILETITLE, message);
            intent.putExtra(AUDIO_FILE, filename);
            startActivity(intent);
        }

        else if (view.getId() == R.id.button38) {
            String message = "38 ኢየሱስ ማእበሉን ጸጥ አደረገ";
            String filename = "a38_jesusstillsstorm_gumuz_2013_0";
            intent.putExtra(FILETITLE, message);
            intent.putExtra(AUDIO_FILE, filename);
            startActivity(intent);
        }

        else if (view.getId() == R.id.button39) {
            String message = "39 የጌርጌሶኑ ሰው";
            String filename = "a39_gerasenedemoniac_gumuz_2013_0";
            intent.putExtra(FILETITLE, message);
            intent.putExtra(AUDIO_FILE, filename);
            startActivity(intent);
        }

        else if (view.getId() == R.id.button40) {
            String message = "40 የእያሩስ ልጅ";
            String filename = "a40_jairus_gumuz_2013_0";
            intent.putExtra(FILETITLE, message);
            intent.putExtra(AUDIO_FILE, filename);
            startActivity(intent);
        }

        else if (view.getId() == R.id.button41) {
            String message = "41 ደጉ ሳምራዊ ";
            String filename = "a41_goodsamartian_gumuz_2013_0";
            intent.putExtra(FILETITLE, message);
            intent.putExtra(AUDIO_FILE, filename);
            startActivity(intent);
        }

        else if (view.getId() == R.id.button42) {
            String message = "42 ሰለ እግዚአብሔር ፍቅር መዝሙር";
            String filename = "a42_songlovefromgod_gumuz_2013";
            intent.putExtra(FILETITLE, message);
            intent.putExtra(AUDIO_FILE, filename);
            startActivity(intent);
        }

        else if (view.getId() == R.id.button43) {
            String message = "43 እጁ የሰለለው ሰው";
            String filename = "a43_witheredhand_gumuz_2013_0";
            intent.putExtra(FILETITLE, message);
            intent.putExtra(AUDIO_FILE, filename);
            startActivity(intent);
        }

        else if (view.getId() == R.id.button44) {
            String message = "44 የፈሪሳዊያን ግብዝነት";
            String filename = "a44_hypocricypharisee_gumuz_2013_0";
            intent.putExtra(FILETITLE, message);
            intent.putExtra(AUDIO_FILE, filename);
            startActivity(intent);
        }

        else if (view.getId() == R.id.button45) {
            String message = "45 ኒቆዲሞስ";
            String filename = "a45_nicodemous_gumuz_2013_0";
            intent.putExtra(FILETITLE, message);
            intent.putExtra(AUDIO_FILE, filename);
            startActivity(intent);
        }

        else if (view.getId() == R.id.button46) {
            String message = "46 በውሃ ጉድጓድ የነበረችው ሴት ";
            String filename = "a46_womanatwell_gumuz_2013_0";
            intent.putExtra(FILETITLE, message);
            intent.putExtra(AUDIO_FILE, filename);
            startActivity(intent);
        }

        else if (view.getId() == R.id.button47) {
            String message = "47 አንተ ክርስቶስ ነህ";
            String filename = "a47_youarechrist_gumuz_2013_0";
            intent.putExtra(FILETITLE, message);
            intent.putExtra(AUDIO_FILE, filename);
            startActivity(intent);
        }

        else if (view.getId() == R.id.button48) {
            String message = "48 አላዛር እና ሃብታሙ ሰው";
            String filename = "a48_lazarusrich_gumuz_2013_0";
            intent.putExtra(FILETITLE, message);
            intent.putExtra(AUDIO_FILE, filename);
            startActivity(intent);
        }

        else if (view.getId() == R.id.button49) {
            String message = "49 ፊሪሳዊው እና ቀራጩ ሰው";
            String filename = "a49_phariseetaxcollector_gumuz_2013";
            intent.putExtra(FILETITLE, message);
            intent.putExtra(AUDIO_FILE, filename);
            startActivity(intent);
        }

        else if (view.getId() == R.id.button50) {
            String message = "50 ሀብታም ወጣቱ መሪ";
            String filename = "a50_richyoungruler_gumuz_2013";
            intent.putExtra(FILETITLE, message);
            intent.putExtra(AUDIO_FILE, filename);
            startActivity(intent);
        }

        else if (view.getId() == R.id.button51) {
            String message = "51 እንደ ህጻናት ገነት መግባት";
            String filename = "a51_enterkingdomlikechildren_gumuz_2013";
            intent.putExtra(FILETITLE, message);
            intent.putExtra(AUDIO_FILE, filename);
            startActivity(intent);
        }

        else if (view.getId() == R.id.button52) {
            String message = "52 አባካኙ ልጅ";
            String filename = "a52_prodigal_gumuz_2013";
            intent.putExtra(FILETITLE, message);
            intent.putExtra(AUDIO_FILE, filename);
            startActivity(intent);
        }

        else if (view.getId() == R.id.button53) {
            String message = "53 ይቅርታ ማድረግ";
            String filename = "a53_forgiveness_gumuz_2013";
            intent.putExtra(FILETITLE, message);
            intent.putExtra(AUDIO_FILE, filename);
            startActivity(intent);
        }

        else if (view.getId() == R.id.button54) {
            String message = "54 አገልጋዮ መሪ ";
            String filename = "a54_servantleader_gumuz_2013";
            intent.putExtra(FILETITLE, message);
            intent.putExtra(AUDIO_FILE, filename);
            startActivity(intent);
        }

        else if (view.getId() == R.id.button55) {
            String message = "55 ዘኪዎስ";
            String filename = "a55_zaccheus_gumuz_2013";
            intent.putExtra(FILETITLE, message);
            intent.putExtra(AUDIO_FILE, filename);
            startActivity(intent);
        }

        else if (view.getId() == R.id.button56) {
            String message = "56 በርጠሚዎስ";
            String filename = "a56_bartimaeus_gumuz_2013";
            intent.putExtra(FILETITLE, message);
            intent.putExtra(AUDIO_FILE, filename);
            startActivity(intent);
        }

        else if (view.getId() == R.id.button57) {
            String message = "57 አስሩ ደናግላን";
            String filename = "a57_tenvirgins_gumuz_2013";
            intent.putExtra(FILETITLE, message);
            intent.putExtra(AUDIO_FILE, filename);
            startActivity(intent);
        }

        else if (view.getId() == R.id.button58) {
            String message = "58 በድል መግባት";
            String filename = "a58_trimphalentry_gumuz_2013";
            intent.putExtra(FILETITLE, message);
            intent.putExtra(AUDIO_FILE, filename);
            startActivity(intent);
        }

        else if (view.getId() == R.id.button59) {
            String message = "59 በድል ስለ መግባት መዝሙር";
            String filename = "a59_triumphalsong_gumuz_2013";
            intent.putExtra(FILETITLE, message);
            intent.putExtra(AUDIO_FILE, filename);
            startActivity(intent);
        }

        else if (view.getId() == R.id.button60) {
            String message = "60 ማሪያም የኢየሱስን እግር ቀባች";
            String filename = "a60_maryanointsjesus_gumuz_2013";
            intent.putExtra(FILETITLE, message);
            intent.putExtra(AUDIO_FILE, filename);
            startActivity(intent);
        }

        else if (view.getId() == R.id.button61) {
            String message = "61 የመጨረሻው እራት";
            String filename = "a61_lastsupper_gumuz_2013";
            intent.putExtra(FILETITLE, message);
            intent.putExtra(AUDIO_FILE, filename);
            startActivity(intent);
        }

        else if (view.getId() == R.id.button62) {
            String message = "62 የኢየሱስ መታሰር እና ፍርድ";
            String filename = "a62_arresttrialjesus_gumuz_2013";
            intent.putExtra(FILETITLE, message);
            intent.putExtra(AUDIO_FILE, filename);
            startActivity(intent);
        }

        else if (view.getId() == R.id.button63) {
            String message = "63 ስቅለት";
            String filename = "a63_crucifixion_gumuz_2013";
            intent.putExtra(FILETITLE, message);
            intent.putExtra(AUDIO_FILE, filename);
            startActivity(intent);
        }

        else if (view.getId() == R.id.button64) {
            String message = "64 ስለመስቀል መዝሙር";
            String filename = "a64_songcross_gumuz_2013";
            intent.putExtra(FILETITLE, message);
            intent.putExtra(AUDIO_FILE, filename);
            startActivity(intent);
        }

        else if (view.getId() == R.id.button65) {
            String message = "65 ትንሳኤ";
            String filename = "a65_resurrection_gumuz_2013";
            intent.putExtra(FILETITLE, message);
            intent.putExtra(AUDIO_FILE, filename);
            startActivity(intent);
        }

        else if (view.getId() == R.id.button66) {
            String message = "66 ስለ ትንሳኤ መዝሙር ";
            String filename = "a66_resurrectionsong_gumuz_2013";
            intent.putExtra(FILETITLE, message);
            intent.putExtra(AUDIO_FILE, filename);
            startActivity(intent);
        }

        else if (view.getId() == R.id.button67) {
            String message = "67 የመንፈስ ቅዱስ መውረድ ";
            String filename = "a67_pentecost_gumuz_2013";
            intent.putExtra(FILETITLE, message);
            intent.putExtra(AUDIO_FILE, filename);
            startActivity(intent);
        }

        else if (view.getId() == R.id.button68) {
            String message = "68 ውብ በር";
            String filename = "a68_beautifulgate_gumuz_2013";
            intent.putExtra(FILETITLE, message);
            intent.putExtra(AUDIO_FILE, filename);
            startActivity(intent);
        }

        else if (view.getId() == R.id.button69) {
            String message = "69 አናኒያስ እና ሲጳራ";
            String filename = "a69_ananiassapphira_gumuz_2013";
            intent.putExtra(FILETITLE, message);
            intent.putExtra(AUDIO_FILE, filename);
            startActivity(intent);
        }

        else if (view.getId() == R.id.button70) {
            String message = "70 ጠንቋዩ ሰምኦን";
            String filename = "a70_simonmagician_gumuz_2013";
            intent.putExtra(FILETITLE, message);
            intent.putExtra(AUDIO_FILE, filename);
            startActivity(intent);
        }

        else if (view.getId() == R.id.button71) {
            String message = "71 የኢትዮጵያው ጀንደረባ";
            String filename = "a71_ethiopianeunuch_gumuz_2013";
            intent.putExtra(FILETITLE, message);
            intent.putExtra(AUDIO_FILE, filename);
            startActivity(intent);
        }

        else if (view.getId() == R.id.button72) {
            String message = "72 ወደ ደማስቆ የሚወስደው መንገድ";
            String filename = "a72_roaddamascus_gumuz_2013";
            intent.putExtra(FILETITLE, message);
            intent.putExtra(AUDIO_FILE, filename);
            startActivity(intent);
        }

        else if (view.getId() == R.id.button73) {
            String message = "73 የእየሩሳሌም ጉባኤ";
            String filename = "a73_jerusalemcouncil_gumuz_2013";
            intent.putExtra(FILETITLE, message);
            intent.putExtra(AUDIO_FILE, filename);
            startActivity(intent);
        }

        else if (view.getId() == R.id.button74) {
            String message = "74 የፈሊፖስዮስ እስረኞች";
            String filename = "a74_philippianjailer_gumuz_2013";
            intent.putExtra(FILETITLE, message);
            intent.putExtra(AUDIO_FILE, filename);
            startActivity(intent);
        }

        else if (view.getId() == R.id.button75) {
            String message = "75 ራዕይ";
            String filename = "a75_revalation_gumuz_2013";
            intent.putExtra(FILETITLE, message);
            intent.putExtra(AUDIO_FILE, filename);
            startActivity(intent);
        }

    }
}
