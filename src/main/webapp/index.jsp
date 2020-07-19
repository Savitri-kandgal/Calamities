<!DOCTYPE html >
<body>
	<h2>Info Of Natural Calamities</h2>
	<form action="report.odc" method ="post">

	Place:
	<input type="text" name="place" required/>
	<br> Date:
	<input type="date" name="date"  required/>
	<br> Captured By:
	<input type="text" name="capturedBy" />
	<br> Calamity Type:
	<select  name="Type" required/>
	<option ></option>
		<option value="flood">Flood</option>
		<option value="rain">Rain</option>
		<option value="Cyclone">Cyclone</option>
		<option value="EarthQuake">EarthQuake</option>
	</select>
	<br>
	 Area :
	<input type="text" name="area" />
	<br>
		<br> Avg. Loss:
	<input type="text" name="avgLoss" />
	<br>
		<br> No. Of Deaths:
	<input type="text" name="noOfDeath" />
	<br>
		<br> No. Of Injured:
	<input type="text" name="noOfInjured" />
<br>


	<input type="submit" value="Register" />
	</form>
	
	${error}
</body>
</html>
