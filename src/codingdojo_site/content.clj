(ns codingdojo-site.content)

(def content
  { :about [
            "Coding Dojo je místo, kam můžete přijít a potrénovat vaše dovednosti v programování.
            Dojo se pořádá pravidelně v různých městech a vždy se dvě hodiny věnujeme řešení zajímavých
            problémů v podobě Kat. Nejen Kat. Společně se také učíme nové jazyky a poznáváme nové
            technologie a přístupy k řešení problému."

            "Zkrátka trénujeme! Dojo se neomezuje na konkrétní jazyky ani na žádnou úroveň dovedností.
            Jazyk i problém je zvolen na začátku každého doja na základě demokratických principů.
            Je to zábava a vítán je každý!"]

    :new-dojo [
               "Pakliže tvé dojo není ještě na seznamu? Neváhej poslat <a href=''>pull-request</a>."
               "Chceš pořádat Doja a nevíš jak začít? Rádi ti pomůžeme.
               Ozvat se můžeš třeba na <a href=''>email</a> ;)"]

    :links [
            ["CodeRetreat CZ" "http://coderetreat.cz/"]
            ["Coding Dojo (Kata catalogue)" "http://codingdojo.org/"]
            ["Understanding the Four Rules of Simple Design" "https://leanpub.com/4rulesofsimpledesign"]
            ["Langton's ant" "http://en.wikipedia.org/wiki/Langton%27s_ant"]
            ["Test Driven Development: By Example" "http://www.amazon.com/Test-Driven-Development-By-Example/dp/0321146530"]
            ["10 Ways to Improve Your Pairing Experience" "http://www.thoughtworks.com/insights/blog/10-ways-improve-your-pairing-experience?utm_campaign=career-hacks&utm_medium=social&utm_source=twitter"]
            ["The Transformation Priority Premise" "http://blog.8thlight.com/uncle-bob/2013/05/27/TheTransformationPriorityPremise.html"]
            ["TDD and the Transformation Priority Premise" "http://securesoftwaredev.com/2012/12/31/tdd-and-the-transformation-priority-premise/"]
            ["Game of Life in Clojure" "https://www.youtube.com/watch?v=hr8RnTfijx0"]
            ["Coding Dojo ve světě" "https://zen.coderdojo.com/dojo"]]

    :photos [
             ["img/2.jpg" "https://instagram.com/p/o3zyyGwGav/"]
             ["img/1.jpg" "https://instagram.com/p/lx9dT0wGTi/"]
             ;["img/4.jpg" "https://instagram.com/p/m5kwdOQGa6/"]
             ["img/3.jpg" "https://instagram.com/p/mnojigwGan/"]]

    :videos ["<iframe src='https://vine.co/v/M1hpB2Ap7VK/embed/simple'
             width='280' height='280' frameborder='0'></iframe>
             <script src='https://platform.vine.co/static/scripts/embed.js'></script>"]

    :hashtag ["#codingdojocz" "https://twitter.com/hashtag/codingdojocz?src=hash"]

    :footer [
             "codingdojo.cz by <a href='http://twitter.com/jirkapenzes'>@jirkapenzes</a>
             and <a href=''>contributors</a> on <a href=''>GitHub</a>"]})

(defn about [] (:about content))
(defn links [] (:links content))
(defn photos [] (:photos content))
(defn videos [] (:videos content))
(defn hashtag [] (:hashtag content))
(defn new-dojo [] (:new-dojo content))
(defn footer [] (:footer content))
