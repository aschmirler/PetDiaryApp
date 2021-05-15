package com.example.mypetdiary;

import java.util.ArrayList;
import java.util.List;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;
import android.os.Bundle;
import androidx.recyclerview.widget.GridLayoutManager;

public class TrainingMainActivity extends AppCompatActivity {

    RecyclerView myrecyclerView;
    RecyclerViewAdapter myAdapter;

    List<Trainings> trainings1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_training_main);

        trainings1 = new ArrayList<>();
        trainings1.add(new Trainings("Leash Walk","You only need a leash and some treats for your dog.","Method",
                "Step 1: Introduce the puppy to the collar or harness and leash.\n\n" +
                        "Step 2: Teach a cue. A cue could be anything like 'food is coming', cluck your tongue.\n\n" +
                        "Step 3: Make the puppy come to you while he is wearing the leash and collar, by luring him with a treat.\n\n" +
                        "Step 4: Now that your puppy understands how to come to you, practice walking a few steps in a room with little distraction.\n\n" +
                        "Step5: Take it outside - Finally, you’re ready to test your puppy’s skills in the Great Outdoors.  ",R.drawable.leash_training));
        trainings1.add(new Trainings("Sit","You only need some treats for your dog.","Method", "Step 1: \n" +
                "With your dog in a standing position, hold a tasty treat near their nose.\n" +
                "Step 2: \n" +
                "Keeping the treat near your dog¿s nose, move your hand in an arc over his head. As the dog raises his head to follow the treat, " +
                "his bottom will go on the floor. The instant he sits, praise him and give him the treat.\n" +
                "Step 3\n" +
                "Practice this a number of times in short but regular sessions.\n" +
                "Step 4:\n" +
                "As the dog always gets a treat for sitting you'll soon find he sits for longer. You can now add the cue word SIT" +
                " as he goes to sit. Be careful not to say it before your dog moves into position or they may associate it with the wrong movement.\n" +
                "Step 5: \n" +
                "Practice this a number of times in short but regular sessions.\n" +
                "Step 6:\n" +
                "Give an okay cue to let your dog know when their training has ended.",R.drawable.sit_training));

        trainings1.add(new Trainings("Play dead","You only need some treats for your dog.","Method", "Step 1: Note which side your dog likes to lie on.\n" +
                "Step 2: Choose the right setting to avoid distraction.\n" +
                "Step 3: Give the down command, which your dog should already know. \n" +
                "Step 4: Coax your dog onto their side:\n" +
                "Hold a dog treat between your first two fingers, a few inches above your dog’s nose. Bring the treat over to their side, luring your dog to roll onto their side to continue looking at the treat. (If your " +
                "dog has already learned the “roll over” trick, they may roll all the way over when learning how to “play dead.” Be sure to give them the treat only when they’re in the correct position.) Don't forget to reward your dog\n" +
                "Step 6: Repeat a few times\n" +
                "Step 7: Add verbal command and visual cue once your dog understands why he is rewarded for.\n" +
                "Step 8: Repeat with verbal cue and hand signal.\n", R.drawable.playdead_training));

        trainings1.add(new Trainings("Lie Down", "You will only need some treats for this.", "Method", "Step 1: You can wait for your dog to lie down (beginning in a boring, small room such as a bathroom can help)\n" +
                "Step 2: Capture the behavior by reinforcing your dog with a treat when he lies down\n" +
                "Give him his release cue to stand back up (and encouragement with a lure if needed) and then waiting for him to lie down again.\n" +
                "When he is quickly lying down after standing up, you can begin saying “down” right before he does so.\n", R.drawable.liedown_training));

        trainings1.add(new Trainings("Stay", "You will only need treats for this.", "Method", "Step 1:First, teach the release word. Choose which word you will use, such as “OK” or “free.”\n" +
                "Step 2: Stand with your puppy in a sit or a stand, toss a treat on the floor, and say your word as he steps forward to get the treat. \n" +
                "Step 3: Repeat this a couple of times until you can say the word first and then toss the treat AFTER he begins to move. This teaches the dog that the release cue means to move your feet.\n" +
                "Step 4: When your dog knows the release cue and how to sit on cue, put him in a sit, turn and face him, and give him a treat.\n" +
                "Step 5: Pause, and give him another treat for staying in a sit, then release him.\n" +
                "Step 6: Gradually increase the time you wait between treats (it can help to sing the ABC’s in your head and work your way up the alphabet).\n " +
                "Step 7: If your dog gets up before the release cue, that’s ok! It just means he isn’t ready to sit for that long so you can make it easier by going back to a shorter time.\n" +
                "Step 8: Once your dog can stay in a sit for several seconds, you can begin adding distance.\n" +
                "Step 9: Place him in a sit and say “stay,” take one step back, then step back to the pup, give a treat, and your release word. \n" +
                "Step 10: Continue building in steps, keeping it easy enough that your dog can stay successful. Practice both facing him and walking away with your back turned (which is more realistic).\n", R.drawable.stay_training));





        myrecyclerView = (RecyclerView)findViewById(R.id.recyclerView_trainings);

        myAdapter = new RecyclerViewAdapter(this,trainings1);

        myrecyclerView.setLayoutManager(new GridLayoutManager(this,1));

        myrecyclerView.setAdapter(myAdapter);

    }

}