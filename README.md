# GY9
Egy lottójáték a következőképpen van megvalósítva.

- A `LottoInterface` egyetlen függvény létét írja elő: a `boolean nyeroszamE()` megadja, hogy az adott számgolyó nyerőszámot takar-e.
- A mellékelt `LottoDeploy` program első paramétere azt adja meg, összesen hány szám lesz (pl. `90`), a második paramétere pedig azt, hogy hány nyerőszám (pl. `5`). A `LottoDeploy` indítása előtt (ugyanabban a könyvtárban!) futtatni kell az `rmiregistry` programot, amely a katalógusszolgáltatást biztosítja.
- A `LottoDeploy` elkészíti a megfelelő számú számgolyót, és bejegyzi őket különböző nevekre a katalógusba, amelyet az `12345` porton indít el.

- Készíts olyan RMI klienst, amely lekérdezi a katalógusból azt, hogy a `LottoDeploy` milyen nevekre jegyezte be a számgolyókat, majd találd meg a nyerőszámokat.
  - A `LottoDeploy` véletlenszerűen sorsolja ki a nyerőszámokat, ezért újraindítás után más lesz az eredmény.
- Készíts saját `LottoDeploy` implementációt. Ez használjon külső névjegyzéket. Minden esetben működjön jól a program, pl. `10`-ből `10` nyerőszám esetén is.

jar futtatása: `java -jar LottoDeploy.jar 90 5`
