package dev.muzzarelli.android.recycler

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import dev.muzzarellimj.android.recycler.R

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val data = """
            [
              {
                "id": 0,
                "name": "Jas",
                "tier": "Elder",
                "race": "Elder God",
                "description": "Behold, the elder god Jas, whose arms crafted the world from clay. You feel disturbingly like an ant staring at the heel of a boot."
              },
              {
                "id": 1,
                "name": "Ful",
                "tier": "Elder",
                "race": "Elder God",
                "description": "The Elder Goddess of Constancy and Fire. The creator of the Elder Kiln and the TokHaar race. Second oldest and second most powerful Elder God."
              },
              {
                "id": 2,
                "name": "Wen",
                "tier": "Elder",
                "race": "Elder God",
                "description": "One of the ancient beings responsible for the creation of the universe, including Gielinor itself. She was also the Elder God related to ice and the cold. Third oldest and third most powerful Elder God."
              },
              {
                "id": 3,
                "name": "Bik",
                "tier": "Elder",
                "race": "Elder God",
                "description": "One of the ancient beings responsible for the creation of the universe, including Gielinor itself. She was also the Elder God related to earth, plant life, and organic matter. Fourth oldest and fourth most powerful Elder God."
              },
              {
                "id": 4,
                "name": "Mah",
                "tier": "Elder",
                "race": "Elder God",
                "description": "The youngest and weakest of the Elder Gods."
              },
              {
                "id":5,
                "name": "Zaros",
                "tier": "Transcendent",
                "race": "Transcendent God",
                "description": "The so-called Empty Lord associated with fate and control who once saw much of Gielinor as his dominion during the Second Age."
              },
              {
                "id": 6,
                "name": "Seren",
                "tier": "Transcendent",
                "race": "Unknown",
                "description": "Seren, goddess of the elves."
              },
              {
                "id": 7,
                "name": "Guthix",
                "tier": "Transcendent",
                "race": "Naragi",
                "description": "The god of balance and the last surviving member of the Naragi race."
              },
              {
                "id": 8,
                "name": "Saradomin",
                "tier": "High",
                "race": "Human",
                "description": "God of order and wisdom. A worried sheen of sweat hangs upon his brow. He seems to be having difficulty coping with his rekindled mortality."
              },
              {
                "id": 9,
                "name": "Bandos",
                "tier": "High",
                "race": "Unnamed -- Kal-i-kra tribe",
                "description": "The god of war -- often referred to as the Big High War God."
              },
              {
                "id": 10,
                "name": "Armadyl",
                "tier": "Experienced",
                "race": "Aviansie",
                "description": "The god of justice. He seems a little distant, as though he is remembering something long forgotten."
              },
              {
                "id": 11,
                "name": "Zamorak",
                "tier": "Experienced",
                "race": "Mahjarrat",
                "description": "The god of chaos. He seems oddly calm considering his divinity has been stripped from him."
              },
              {
                "id": 12,
                "name": "Tuska",
                "tier": "Experienced",
                "race": "Unknown",
                "description": "A boar-like goddess who attacked Naragun during the Naragi God Wars."
              },
              {
                "id": 13,
                "name": "Tumeken",
                "tier": "Inexperienced",
                "race": "Unknown",
                "description": "Sometimes referred to in Menaphite texts as the Lord of Light and God of the Sun."
              },
              {
                "id": 14,
                "name": "Elidinis",
                "tier": "Inexperienced",
                "race": "Unknown",
                "description": "The Menaphite goddess of fertility and growth, heavily associated with the River Elid."
              },
              {
                "id": 15,
                "name": "Marimbo",
                "tier": "Inexperienced",
                "race": "Gorilla",
                "description": "The god of having a good time, worshipped by the monkeys of Ape Atoll."
              },
              {
                "id": 16,
                "name": "Brassica Prime",
                "tier": "Inexperienced",
                "race": "Cabbage",
                "description": "Just a cabbage, or a god. Sometimes it's hard to tell the difference."
              }
            ]
        """
    }
}