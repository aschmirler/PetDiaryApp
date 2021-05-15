package com.example.mypetdiary;

import java.util.ArrayList;
import java.util.List;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;
import android.os.Bundle;
import androidx.recyclerview.widget.GridLayoutManager;

public class DogTippMainActivity extends AppCompatActivity {

    RecyclerView myDogRecyclerView;
    RecyclerViewAdapterDog myAdapter;

    List<DogTipps> dogtipps1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dog_tipp_main);

        dogtipps1 = new ArrayList<>();
        dogtipps1.add(new DogTipps("Health Tips","1: Don't overfeed your dog, it will significantly impact their health and happiness. \n\n" +
                "Overweight dogs are at increased risk of metabolic abnormalities, cardiovascular disease, joint diseases, a lowered immune system, and many other health problems.\n\n\n" +
                "2: Touch your dog’s nose\n\n" +
                "Your dog’s nose should feel wet. The level of moisture will vary between dogs and by time of year, but a healthy dog will have a cool and slightly wet nose because " +
                "dogs secrete sweat through their nose to cool down.\n\n\n" +
                "3. Make annual vet appointments\n\n" +
                "Let the experts examine your dog regularly to screen them for any health issues and to provide you with the best, personalized information.\n\n\n" +
                "4. Make a \"pet first aid\" kit.\n\n" +
                "5: Brush your dog's teeth.\n\n\n" +
                "6: Play with Purpose. ",R.drawable.dog_health_tipps));
        dogtipps1.add(new DogTipps("Housekeeping and puppy-proofing", "1: Keep your trash secured\n\n" +
                "Dogs are drawn to the delicious smell of your trash and may eat things that are toxic, harmful, or not digestible , so make sure your trash is secure.\n\n\n" +
                "2: Give the dog a safe place\n\n" +
                "Have a temperate area of your home with your dog’s bed or blanket, some toys, and a water bowl, where your dog feels safe and can easily take naps during the day.\n\n\n" +
                "3: Lock up the household toxins: \n\n" +
                "Always keep your household chemicals, such as cleaners and pesticides, out of reach from your dog.\n\n\n" +
                "4: Regularly wash your dog's things \n\n" +
                "Germs, dirt, pollen, and more end up on your dog’s bedding, soft toys, and blankets. Make sure you’re washing these items weekly to keep them fresh and clean for your dog.\n\n\n" +
                "5: Keep your dog away from human food.\n\n" +
                "Many human foods, such as chocolate, avocados, or onions, are toxic to dogs and can have serious ramifications to their health. Keep human food out of reach and be especially " +
                "careful with gum and candies, as many contain xylitol which is a sugar-like substance toxic to dogs.", R.drawable.dog_at_home));
        dogtipps1.add(new DogTipps("Exercise and Mental Stimulation", "1: Walk your dog for both their health and happiness\n" +
                "Regular walks provide many benefits for your dog, including preventing boredom, helping the digestive tract, keeping them at a healthier weight, and helping them to burn off excess energy.\n\n" +
                "2: Fight boredom by adding variety\n\n" +
                "Break up your dog’s normal routine by adding in extra walks or outings. Take them to a dog-friendly place or drive-in for a change of scenery.\n\n\n" +
                "3: Challenge your dog mentally\n\n" +
                "Just like us, dogs need plenty of mental stimulation to stay happy and healthy. Give your dog a puzzle toy, teach them new tricks, and play new games with them to keep them engaged.\n\n\n" +
                "4: Slowing down a super eater\n\n" +
                "If your dog or puppy eats their meals very quickly they increase their risk of having stomach issues or upsets that may lead to vomiting. Slowing down your dog’s eating is good for their digestive health and can be done easily.\n\n\n" +
                "5: Exercise together\n\n" +
                "Race your dog in the park, try dog yoga, climb stairs with your dogs, or take them on an adventurous hike. You’ll both reap the benefits of exercise as you have fun together.", R.drawable.dog_mental_health));

        dogtipps1.add(new DogTipps("Bonding", "1: Be a friend to your dog \n\n" +
                "Dogs need love and affection to thrive. Make sure they’re spending plenty of time inside with you and your family. Give them attention, treats, and play games with them.\n\n\n" +
                "2: Have patience with them\n\n" +
                "It can be challenging when your dog acts out or isn’t picking up on a new training technique, but with some grace and patience, they’ll be more likely to continue trying.\n\n\n" +
                "3: Hang out with them while they eat\n\n" +
                "Dogs are by nature pack animals and you’re their pack. Stay near them when they eat and make this an ongoing communal act. Picky eaters might also show more interest in their food when they see you take an interest.\n\n\n", R.drawable.dog_human));

        dogtipps1.add(new DogTipps("Training", "1: Applaud your pet when they successfully relieve themselves outside\n\n" +
                "Potty training can be difficult, especially with stubborn dog breeds. Applaud and cheer your dog on when they go outside and do their business every time and they’ll eagerly continue this behavior until it becomes a habit.\n\n\n" +
                "2: Make training a game\n\n" +
                "Switch up the treats, rewards, and praise. If they view training as a game, rather than something they are scolded during, they will have more fun and you’ll see better results. You may also find that your dog responds " +
                "better to different types of rewards through this process.\n\n\n" +
                "3: Consistent training is key\n\n " +
                "Decide what the “house rules” for your dog are and stick with them! Will your dog be allowed on furniture, in all parts of the house, or around the family during dinnertime? \n\n\n" +
                "4: Immediately correct bad behavior\n\n" +
                "Dogs have a short memory and if you scold them for doing something wrong five minutes later, they will not correlate the scolding with the bad behavior.", R.drawable.dog_training_tipp));

        dogtipps1.add(new DogTipps("Dog Safety", "1: Never let your dog ride in the back of your truck\n\n" +
                "Approximately 100,000 dogs die from riding in the flatbed of a truck each year, whether this is from falling out of the truck bed or being hit by debris.\n\n\n" +
                "2: Keep an ID tag on your dog at all times\n\n" +
                "You never know how important an ID tag is until you become separated from your dog. Take the time to have an ID tag made up with your phone number, dog’s name, and vet’s phone number.\n\n\n" +
                "3: Microchip your dog\n\n" +
                "Accidents happen and dogs can get loose from their collars. If your dog gets lost but is microchipped, a veterinary hospital or animal shelter will scan all found pets for microchips and can look up your personal information and get in contact with you if your dog has one.\n\n\n" +
                "4: Keep your dog on a leash at all times when in public\n\n" +
                "Even the most obedient dog may take off running if they see another dog, human, or animal. Be responsible and keep your dog leashed in public places to avoid losing your dog or having any accidents or injuries such as dog fights, vehicle impacts, or other physical harm.\n\n\n" +
                "5: Consult your veterinarian before trying new foods or medications\n\n" +
                "Diet or medication changes can cause several health issues for your pet if not done properly or with the instruction of your vet. ", R.drawable.dog_safety));
        myDogRecyclerView = (RecyclerView)findViewById(R.id.recyclerView_dog);

        myAdapter = new RecyclerViewAdapterDog(this,dogtipps1);

        myDogRecyclerView.setLayoutManager(new GridLayoutManager(this,1));

        myDogRecyclerView.setAdapter(myAdapter);

    }

}