
# BubbleShowCase 😍💕

BubbleShowCase is an elegant and simple framework developed in Kotlin (usable also in Java) that let you to use informative bubbles to help your users pointing out different features of your application or in your App onboarding. The basic use of the framework consists on a target element passed as input which will be highlighted over a translucent background and pointed out by a customizable bubble.



## Acknowledgements

 - [Awesome Readme Templates](https://github.com/ECLaboratorio/BubbleShowCase-Android)
 - [Awesome README](https://github.com/ECLaboratorio/BubbleShowCase-Android#readme)
 
 With respect to *** JorgeCM ***
 who is created this idea and project first and developed until 2018.

 Unfortunely, Jcenter is removed from Android (Java and Kotlin) and I Forked his project but he didn't work on it. So I published this one.

 ## Thank you JorgeCM 👏

 Good luck.




## ✍️ Authors 

- [@JorgeCM](https://www.github.com/JorgeCM)  
- [@Mori-hub](https://www.github.com/Mori-hub) 



## 📑Documentation

[Kotlin](https://github.com/ECLaboratorio/BubbleShowCase-Android#readme)

[Java](https://github.com/Mori-hub/BubbleShowCase/tree/master#readme)



# Java 

This is a simplest way use this lib in Java.

## 📚Installation


```bash
  dependencies {
	     implementation 'com.github.Mori-hub:BubbleShowCase:1.0.0'
	}
```

## 🧰Usage Simplest way:

```javascript
  BubbleShowCaseBuilder builder1 = new BubbleShowCaseBuilder(this);
  builder1  
                .title("FAB Menu") //Any title for the bubble view
                .description("Here you can access ..")
  				      .targetView(findViewById(R.id.View))
                .disableCloseAction(true)
                .show(); //Display the ShowCase
	        
```
## 🧰Usage Listener

```javascript
  BubbleShowCaseBuilder builder1 = new BubbleShowCaseBuilder(this);
   builder1 //Activity instance
                .title("FAB Menu") //Any title for the bubble view
                .description("Here you can access  ...")
                .listener(new BubbleShowCaseListener() {
                    @Override
                    public void onTargetClick(@NonNull BubbleShowCase bubbleShowCase) {
                       
                    }
                    @Override
                    public void onCloseActionImageClick(@NonNull BubbleShowCase bubbleShowCase) {
                    }
                    @Override
                    public void onBackgroundDimClick(@NonNull BubbleShowCase bubbleShowCase) {
                    }
                    @Override
                    public void onBubbleClick(@NonNull BubbleShowCase bubbleShowCase) {
                    }
                })
                .targetView(findViewById(R.id.floatingActionButton))
                .disableCloseAction(true)
                .show(); //Display the ShowCase
	        
```
## BubbleShowCaseSequence sample
``` javascript
 BubbleShowCaseSequence bubbleShowCaseSequence = new BubbleShowCaseSequence();
 bubbleShowCaseSequence.add(builder1);
 bubbleShowCaseSequence.add(builder2);
 ...
 bubbleShowCaseSequence.show();
 ```
## BubbleShowCaseSequence Advanced Way
``` javascript
 
  BubbleShowCaseBuilder builder1 = new BubbleShowCaseBuilder(this);
        ArrayList<BubbleShowCaseBuilder> builders = new ArrayList<>();
        for (int i = 0; i < 9; i++)
            builders.add(new BubbleShowCaseBuilder(this));
 
 builders.get(0).title(" Title 0").description("This 0").targetView(view0);
 ...
 builders.get(8).title(" Title 8").description("This 8").targetView(view8);
 
 
 BubbleShowCaseSequence bubbleShowCaseSequence = new BubbleShowCaseSequence();
 
 for (int i = 1; i < builders.size(); i++)
            bubbleShowCaseSequence.addShowCase(builders.get(i));
 
 bubbleShowCaseSequence.show();
 ```
