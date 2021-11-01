package com.acg.apnasiddharthnagar.user;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.TextView;
import android.widget.Toast;

import com.acg.apnasiddharthnagar.HelperClasses.Categories.CategoriesAdapter;
import com.acg.apnasiddharthnagar.HelperClasses.Home.FeaturedAdapter;
import com.acg.apnasiddharthnagar.HelperClasses.AllHelperClass;
import com.acg.apnasiddharthnagar.HelperClasses.MostView.MostViewAdapter;
import com.acg.apnasiddharthnagar.R;

import java.util.ArrayList;

public class UserDashboard extends AppCompatActivity {
    RecyclerView featureRecycler, mostviewRecycler, categoryviewRecycler;
    RecyclerView.Adapter adapter;
    TextView ViewallLocation, ViewallFeamousLocation;
    String No_use = "";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_user_dashboard);

       //Hooks
       featureRecycler = findViewById(R.id.featured_recycler);
       mostviewRecycler = findViewById(R.id.most_view_Recycler);
       categoryviewRecycler = findViewById(R.id.categoryies);
       ViewallLocation = findViewById(R.id.viewallLoaction);
       ViewallFeamousLocation = findViewById(R.id.viewallFamousLocation);
       viewall();

       featureRecycler();
       mostViewRecycler();
       categoryViewRecycler();

    }


    private void featureRecycler(){
        featureRecycler.setHasFixedSize(true);
        featureRecycler.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false));
        String naugrah = "जिला का नाम राजकुमार सिद्धार्थ, बुद्ध के पूर्व ज्ञानदान नाम के नाम पर रखा गया था, क्योंकि उन्होंने कपिलवस्तु में अपने शुरुआती वर्षों (2 9 वर्ष की आयु तक) बिताया था, जिनमें से कुछ इस जिले में शामिल थे। सिद्धार्थगर जिला 27 डिग्री एन से 27 ° 28′ और 82 ° 45’ एन से 830 10′| यह जनपद उत्तर में नेपाल के जिला कपिलवस्तु और उत्तर-पश्चिम में रुपन्देही की सीमाओं पर है।  जनपद के पूर्व में महाराजगंज, दक्षिण में बस्ती और संत कबीर नगर, और पश्चिम में बलरामपुर जनपद हैं । सिद्धार्थनगर का कुल क्षेत्रफल 2,895 वर्ग किमी मीटर है।"
                +" सिद्धार्थनगर, उत्तर भारत में उत्तर प्रदेश राज्य के 75 जिलों में से एक है। नौगढ़ शहर जिला मुख्यालय है। नौगढ़ गोरखपुर-आनंदनगर-गोंडा ब्रॉड-गेज लाइन पर एक रेलवे स्टेशन भी है। सिध्दार्थ नगर जिले बस्ती डिवीजन का एक हिस्सा है। जिला शक्या जनपद के खंडहर के लिए जाना जाता है, पिपरहवा में, जो कि जिला मुख्यालय नौगढ़ से 22 किमी दूर है।";
        String SiddharthUniversity = "ये यूनिवर्सिटी जिले के नाम पर या ये कहे कि ये गौतम बुद्धा के नाम पर रखा गया है और ये कपिलवस्तु में है ";

        ArrayList<AllHelperClass> featuredLoactions = new ArrayList<>();
        featuredLoactions.add(new AllHelperClass(R.drawable.railwaysdr,"Naugarh","सिद्धार्थ नगर  ",naugrah));
        featuredLoactions.add(new AllHelperClass(R.drawable.siddharthuniversity,"Siddharth University","सिद्धार्थ यूनिवर्सिटी ",SiddharthUniversity));
        adapter = new FeaturedAdapter(featuredLoactions);
        featureRecycler.setAdapter(adapter);


    }
    private void mostViewRecycler() {

        mostviewRecycler.setHasFixedSize(true);
        mostviewRecycler.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false));

        String SdrDis = "ये नौगढ़ का नया पार्क है ठीक इसके सामने ही नौगढ़ का पुराना पार्क है जिसमे गौतम बुद्धा कि मूर्ति है ";
        String KapilVastu = "कपिलवस्तु, शाक्य गण की राजधानी था। गौतम बुद्ध के जीवन के प्रारम्भिक काल खण्ड यहीं पर व्यथीत हुआ था।";
               ArrayList<AllHelperClass> mostViewLocation = new ArrayList<>();
        mostViewLocation.add(new AllHelperClass(R.drawable.siddharthnagarpark,"Siddharth Nagar Park","नौगढ़ पार्क ",SdrDis));
        mostViewLocation.add(new AllHelperClass(R.drawable.kapilvastu,"Kapil Vastu","कपिलवस्तु",KapilVastu));

        adapter = new MostViewAdapter(mostViewLocation);
        mostviewRecycler.setAdapter(adapter);
    }

    private  void categoryViewRecycler(){
        categoryviewRecycler.setHasFixedSize(true);
        categoryviewRecycler.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false));
        String BirdPur = "अंग्रेजी हुकूमत के दौरान अंग्रेज जमींदार विलियम बर्ड ने सिद्धार्थनगर जिले के बर्डपुर बस्ती को बसाया था और आज भी यहां की पंचायतों को एक से लेकर 14 नंबर से जाना जाता है। ... बर्डपुर नम्बर से 14 के बीच बंटी उनकी रियासत 1947 में भारत के आजाद होने के बाद भी जस की तस स्थिति में बनी हुई है।"
                +"यहाँ की एक मिठाई बहुत हे मशहूर है जिसका नाम रामकटोरी है ";
       String Bansi ="बाँसी उत्तर प्रदेश के सिद्धार्थनगर जिले का एक बड़ा शहर है यहाँ पर फरवरी मार्च में एक बहुत ही विशाल और आकर्षक मेला लगता है जिसको देखने के लिए लोग दूर दूर से आते है, और यहाँ का खाजा बहुत ही मशहूर है ";

        ArrayList<AllHelperClass> categorylocations = new ArrayList<>();
        categorylocations.add(new AllHelperClass(R.drawable.birdpur,"Birdpur","बर्ड पुर ",BirdPur));
        categorylocations.add(new AllHelperClass(R.drawable.bansi,"Bansi","बांसी ", Bansi));

        adapter = new CategoriesAdapter(categorylocations);
        categoryviewRecycler.setAdapter(adapter);
    }

private  void viewall(){
    ViewallLocation.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Toast.makeText(getApplicationContext(),"No more data ",Toast.LENGTH_SHORT).show();
        }
    });
    ViewallFeamousLocation.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Toast.makeText(getApplicationContext(),"No more data",Toast.LENGTH_SHORT).show();
        }
    });

}
}