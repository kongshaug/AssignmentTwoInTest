# AssignmentTwoInTest


## Computer mouse

Identify the types of testing you would perform on a computer mouse, to
make sure that it is of the highest quality.

## Performance testing / Duability testing

Da en mus bliver brugt dagligt, i lang tid er det vigtigt at den kan holde til lang tids brug. Derfor skal musen under udviklingen blive testet for om den holder til meget brug.

## Stress

En gang i mellem vil musen blive tabt på gulvet. Lagt i en rygsæk med computer og andre ting. Og nogle gamere vil kaste med musen når de taber.
En mus af høj kvalitet skal kunne holde til alle disse ting. Derfor skal vi teste for disse.

## Unit

Alle de seperate elementer af musen skal også testes, hver klik funktion skal værke. Musen skal registrere når man bevæger den og alle ekstra knapper og funktionalister skal testes individuelt.

## Performance testing

Når musen bevæges er det ikke nok den registrer man bevæger den. En mus af høj kvalitet skal registrere bevægelse på få millisekunder. Denne reaktionstid skal også testes.

## Integration 
En ikke trådløs mus består af 3 elementer:
Selve musen, ledning og usb stik.
Integrationen af disse 3 elementer skal være af høj kvalitet så de ikke går fra hinanden under brug.


## Catastrophic failure
Find a story where a software system defect had a bad outcome. Describe what happened. Can you identify a test that would have prevented it?


> Imagine waking up one day, checking your mailbox an receiving a letter from your hospital saying you died. Well, that is precisely what happened to 8500 people who received   > treatment between Oct 25 and Dec 11 at St. Mary’s Mercy Hospital. So what happened? It turns out the hospital had recently upgraded its patient-management software system.    > However, a mapping error in the software resulted in the system assigning a code of 20 (which means “expired”) instead of 01 which meant the patient had been discharged. But  > that is not all. The erroneous data was not only sent to the patients but also to insurance companies and the local Social Security Office. It is not clear how

[kilde til historien](https://blog.bitsrc.io/software-is-not-perfect-cases-of-software-failure-and-their-consequences-f5fec39c038f)


Det er en bemærkelsesværdigt at artiklen både skriver både at problemet var et **”mapping error”** og slutter med **”It is not clear how”** men nok om det.
Hvis systemet havde implementeret tilstrækkeligt unit test af mapping funktionaliteten havde de med en simpel test fanget mapping fejlen.
























## JUnit 5

Investigate JUnit 5 (Jupiter). Explain the following, and how they are useful.

* @Tag

Giver tests tags, f.eks. gruppere test under tagget ”unit” for alle unit tests. Det er en anden måde, end @Nested, at gruppere test sammen der er realteret.

* @Disabled

Dette tag gør at testen ikke bliver kørt
Kan også tage imod en beskrivelse om hvorfor den er disabled
* @RepeatedTest

Denne test skal køres flere gange og annotationen tager imod et tal for hvor mange gange den skal køre
* @BeforeEach, @AfterEach

Before each -  kører før hver test. Kan bruges til at gøre objekter klar, der skal bruges på tværs af alle test og metoden kan sikre at objekterne ikke bliver påvirket af foregående tests.
After each -  kører efter hver test. Kan bruges til at ”rydde op” efter en test
* @BeforeAll, @AfterAll

Before all - kører en gang før alle test eksekveres. F.eks. kan det bruges til at initialisere forskellige objekter eller en database kan blive populated med data.
After all - kører en gang efter at alle test er eksekveret. F.eks. at nulstille en database.
* @DisplayName

Når testen køre bliver en beskrivelse af testen vist
* @Nested

Gruppere test sammen, der tester samme funktionalitet, i en samlet test-klasse.
* assumeFalse, assumeTrue

Bruges indeni test.
De bruges til at teste om en tilstand er sand eller falsk, hvis den er hvad du forventer fortsætter testen. Hvis den ikke er skipper den resten af testen. 
Mocking frameworks

## mockito-vs-easymock-vs-jmockit
* What are their similarities and differences ?
Alle tre er nemme at konfigurer og anvender annotationer til at gøre det nemmere at definere mocken
Men af de 3 har Mockito flest annotationer.
Alle 3 følger same pattern: “record-reply-verify” men JMockit tvinger en til at følge dette pattern mere end de to andre og kan deraf føre til bedre strukturerede tests.
En vigtig faktor er hver nemt det er at anvende framworket, det lader til stemningen på nettet hælder til JMockit er nemmere at arbejde med end de to andre.
Af de tre er det Mockito er den mest kendte af de tre og har derfor størst support på nettet.
* Which one would you prefer, if any, and why?
Jeg har ikke nok erfaring til at komme med et kvalificeret bud på hvilken der er bedst men det lader til Mockito ville være et godt bud. Når man er ny udvikler er det vigtig med meget support på nettet til at støtte sig op af. 


