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

        Integer buttonID = view.getId();
        String message = "";
        String filename = "";

        switch(buttonID) {

            case R.id.button01 :
                message = "1 ዘፍጥረት";
                filename = "a01_creation_gumuz_2013";
                break;

            case R.id.button02 :
                message = "2 የዘፍጥረት መዝሙር";
                filename = "a02_songcreation_gumuz_2013";
                break;

            case R.id.button03 :
                message = "3 አዳምና ሔዋን";
                filename = "a03_adameve_gumuz_2013_0";
                break;

            case R.id.button04 :
                message = "4 የሰው ውድቀት";
                filename = "a04_fall_gumuz_2013_0";
                break;

            case R.id.button05 :
                message = "5 ሁሉም በደሉ";
                filename = "a05_allhavesinned_gumuz_2013_0";
                break;

            case R.id.button06 :
                message = "6 አቤል እና ቃየን";
                filename = "a06_cainabel_gumuz_2013_0";
                break;

            case R.id.button07 :
                message = "7 አቤል እና ቃየን መዝሙር";
                filename = "a07_songcainabel_gumuz_2013_0";
                break;

            case R.id.button08 :
                message = "8 አቤል እና ቃየን የሴቶች መዝሙር";
                filename = "a08_womansongcainabel_gumuz_2013_0";
                break;

            case R.id.button09 :
                message = "9 ኖህ";
                filename = "a09_noah_gumuz_2013_0";
                break;

            case R.id.button10 :
                message = "10 ኖህ መዝሙር";
                filename = "a10_songnoah_gumuz_2013_0";
                break;

            case R.id.button11 :
                message = "11 ሳይጣን";
                filename = "a11_lucifersatan_gumuz_2013_0";
                break;

            case R.id.button12 :
                message = "12 የአብርሃም ቃልኪዳን";
                filename = "a12_abrahamcovenant_gumuz_2013_0";
                break;

            case R.id.button13 :
                message = "13 የአብርሃም መጠራት";
                filename = "a13_callabrahamsong_gumuz_2013_0";
                break;

            case R.id.button14 :
                message = "14 ሳራና አጋር";
                filename = "a14_sarahhagar_gumuz_2013_0";
                break;

            case R.id.button15 :
                message = "15 የይስሃቅ ቃልኪዳን";
                filename = "a15_promiseisaac_gumuz_2013_0";
                break;

            case R.id.button16 :
                message = "16 አብርሃምና ይስሃቅ";
                filename = "a16_abrahamisaac_gumuz_2013_0";
                break;

            case R.id.button17 :
                message = "17 በፈተና መደሰት";
                filename = "a17_joyfultrial_gumuz_2013_0";
                break;

            case R.id.button18 :
                message = "18 ያእቆብ በረከትን ሰረቀ";
                filename = "a18_jacobstolenblessing_gumuz_2013_0";
                break;

            case R.id.button19 :
                message = "19 ያእቆብና ኤሳው ታረቁ";
                filename = "a19_jacobeasureconcile_gumuz_2013_0";
                break;

            case R.id.button20 :
                message = "20 ዮሴፍ ህልም አየ";
                filename = "a20_josephdreamer_gumuz_2013_0";
                break;

            case R.id.button21 :
                message = "21 የሴቶች መዝሙር ስለዮሴፍ";
                filename = "a21_womenjosephsong_gumuz_2013_0";
                break;

            case R.id.button22 :
                message = "22 ዮሴፍ ነገሰ";
                filename = "a22_josephgovernor_gumuz_2013";
                break;

            case R.id.button23 :
                message = "23 ሙሴ እና የእሳት ቁጥቋጦ";
                filename = "a23_mosesburningbush_gumuz_2013_0";
                break;

            case R.id.button24 :
                message = "24 ፋሲካ ";
                filename = "a24_passover_gumuz_2013_0";
                break;

            case R.id.button25 :
                message = "25 የፋሲካ በግ";
                filename = "a25_songpassoverlamb_gumuz_2013_0";
                break;

            case R.id.button26 :
                message = "26 10ቱ ትዛዛት";
                filename = "a26_tencommandements_gumuz_2013_0";
                break;

            case R.id.button27 :
                message = "27 ስለ 10ቱ ትዛዛት መዝሙር";
                filename = "a27_songcommandments_gumuz_2013";
                break;

            case R.id.button28 :
                message = "28 ሰላዮች";
                filename = "a28_spies_gumuz_2013_0";
                break;

            case R.id.button29 :
                message = "29 ስለ ሰላዮች መዝሙር";
                filename = "a29_spiesgrumblingsong_gumuz_2013_0";
                break;

            case R.id.button30 :
                message = "30 ዮርዳኖስ ዎንዝን ማቋረጥ";
                filename = "a30_crossingjordan_gumuz_2013_0";
                break;

            case R.id.button31 :
                message = "31 ጌታን ማመስገን";
                filename = "a31_praiselord_gumuz_2013";
                break;

            case R.id.button32 :
                message = "32 ጠላቶቻችንን ስለመውደድ መዝሙር";
                filename = "a32_songloveyourenemies_gumuz_2013";
                break;

            case R.id.button33 :
                message = "33 የኢየሱስ መወለድ";
                filename = "a33_birthjesus_gumuz_2013_0";
                break;

            case R.id.button34 :
                message = "34 የኢየሱስ ጥምቀት";
                filename = "a34_baptismjesus_gumuz_2013_0";
                break;

            case R.id.button35 :
                message = "35 የመጀመሪያዎቹ ደቀመዛሙርት";
                filename = "a35_firstdisciples_gumuz_2013_0";
                break;

            case R.id.button36 :
                message = "36 የሚጥል በሽታ ያለበት  ሰው";
                filename = "a36_paralytic_gumuz_2013_0";
                break;

            case R.id.button37 :
                message = "37 የዘሪው ምሳሌ";
                filename = "a37_sower_gumuz_2013_0";
                break;

            case R.id.button38 :
                message = "38 ኢየሱስ ማእበሉን ጸጥ አደረገ";
                filename = "a38_jesusstillsstorm_gumuz_2013_0";
                break;

            case R.id.button39 :
                message = "39 የጌርጌሶኑ ሰው";
                filename = "a39_gerasenedemoniac_gumuz_2013_0";
                break;

            case R.id.button40 :
                message = "40 የእያሩስ ልጅ";
                filename = "a40_jairus_gumuz_2013_0";
                break;

            case R.id.button41 :
                message = "41 ደጉ ሳምራዊ ";
                filename = "a41_goodsamartian_gumuz_2013_0";
                break;

            case R.id.button42 :
                message = "42 ሰለ እግዚአብሔር ፍቅር መዝሙር";
                filename = "a42_songlovefromgod_gumuz_2013";
                break;

            case R.id.button43 :
                message = "43 እጁ የሰለለው ሰው";
                filename = "a43_witheredhand_gumuz_2013_0";
                break;

            case R.id.button44 :
                message = "44 የፈሪሳዊያን ግብዝነት";
                filename = "a44_hypocricypharisee_gumuz_2013_0";
                break;

            case R.id.button45 :
                message = "45 ኒቆዲሞስ";
                filename = "a45_nicodemous_gumuz_2013_0";
                break;

            case R.id.button46 :
                message = "46 በውሃ ጉድጓድ የነበረችው ሴት ";
                filename = "a46_womanatwell_gumuz_2013_0";
                break;

            case R.id.button47 :
                message = "47 አንተ ክርስቶስ ነህ";
                filename = "a47_youarechrist_gumuz_2013_0";
                break;

            case R.id.button48 :
                message = "48 አላዛር እና ሃብታሙ ሰው";
                filename = "a48_lazarusrich_gumuz_2013_0";
                break;

            case R.id.button49 :
                message = "49 ፊሪሳዊው እና ቀራጩ ሰው";
                filename = "a49_phariseetaxcollector_gumuz_2013";
                break;

            case R.id.button50 :
                message = "50 ሀብታም ወጣቱ መሪ";
                filename = "a50_richyoungruler_gumuz_2013";
                break;

            case R.id.button51 :
                message = "51 እንደ ህጻናት ገነት መግባት";
                filename = "a51_enterkingdomlikechildren_gumuz_2013";
                break;

            case R.id.button52 :
                message = "52 አባካኙ ልጅ";
                filename = "a52_prodigal_gumuz_2013";
                break;

            case R.id.button53 :
                message = "53 ይቅርታ ማድረግ";
                filename = "a53_forgiveness_gumuz_2013";
                break;

            case R.id.button54 :
                message = "54 አገልጋዮ መሪ ";
                filename = "a54_servantleader_gumuz_2013";
                break;

            case R.id.button55 :
                message = "55 ዘኪዎስ";
                filename = "a55_zaccheus_gumuz_2013";
                break;

            case R.id.button56 :
                message = "56 በርጠሚዎስ";
                filename = "a56_bartimaeus_gumuz_2013";
                break;

            case R.id.button57 :
                message = "57 አስሩ ደናግላን";
                filename = "a57_tenvirgins_gumuz_2013";
                break;

            case R.id.button58 :
                message = "58 በድል መግባት";
                filename = "a58_trimphalentry_gumuz_2013";
                break;

            case R.id.button59 :
                message = "59 በድል ስለ መግባት መዝሙር";
                filename = "a59_triumphalsong_gumuz_2013";
                break;

            case R.id.button60 :
                message = "60 ማሪያም የኢየሱስን እግር ቀባች";
                filename = "a60_maryanointsjesus_gumuz_2013";
                break;

            case R.id.button61 :
                message = "61 የመጨረሻው እራት";
                filename = "a61_lastsupper_gumuz_2013";
                break;

            case R.id.button62 :
                message = "62 የኢየሱስ መታሰር እና ፍርድ";
                filename = "a62_arresttrialjesus_gumuz_2013";
                break;

            case R.id.button63 :
                message = "63 ስቅለት";
                filename = "a63_crucifixion_gumuz_2013";
                break;

            case R.id.button64 :
                message = "64 ስለመስቀል መዝሙር";
                filename = "a64_songcross_gumuz_2013";
                break;

            case R.id.button65 :
                message = "65 ትንሳኤ";
                filename = "a65_resurrection_gumuz_2013";
                break;

            case R.id.button66 :
                message = "66 ስለ ትንሳኤ መዝሙር ";
                filename = "a66_resurrectionsong_gumuz_2013";
                break;

            case R.id.button67 :
                message = "67 የመንፈስ ቅዱስ መውረድ ";
                filename = "a67_pentecost_gumuz_2013";
                break;

            case R.id.button68 :
                message = "68 ውብ በር";
                filename = "a68_beautifulgate_gumuz_2013";
                break;

            case R.id.button69 :
                message = "69 አናኒያስ እና ሲጳራ";
                filename = "a69_ananiassapphira_gumuz_2013";
                break;

            case R.id.button70 :
                message = "70 ጠንቋዩ ሰምኦን";
                filename = "a70_simonmagician_gumuz_2013";
                break;

            case R.id.button71 :
                message = "71 የኢትዮጵያው ጀንደረባ";
                filename = "a71_ethiopianeunuch_gumuz_2013";
                break;

            case R.id.button72 :
                message = "72 ወደ ደማስቆ የሚወስደው መንገድ";
                filename = "a72_roaddamascus_gumuz_2013";
                break;

            case R.id.button73 :
                message = "73 የእየሩሳሌም ጉባኤ";
                filename = "a73_jerusalemcouncil_gumuz_2013";
                break;

            case R.id.button74 :
                message = "74 የፈሊፖስዮስ እስረኞች";
                filename = "a74_philippianjailer_gumuz_2013";
                break;

            case R.id.button75 :
                message = "75 ራዕይ";
                filename = "a75_revalation_gumuz_2013";
                break;

            default :
                message = "fail";
                filename = "not_specified";
                break;
        }

        if (filename != "not_specified") {
            intent.putExtra(FILETITLE, message);
            intent.putExtra(AUDIO_FILE, filename);
            startActivity(intent);
        }
    }
}
