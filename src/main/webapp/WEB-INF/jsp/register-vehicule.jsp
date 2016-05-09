<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<br />
<form:form commandName="vehicule" cssClass="form-horizontal">
	<div class="form-group">
		<label for="immatriculation" class="col-sm-4 control-label">Immatriculation
			:</label>
		<div class="col-sm-4">
			<form:input path="immatriculation" cssClass="form-control" />
		</div>
	</div>
	<div class="form-group">
		<label for="marque" class="col-sm-4 control-label">Marque :</label>
		<div class="col-sm-4">
			<form:select path="marque" cssClass="form-control">
				<form:options items="${marques}" />
			</form:select>
		</div>
	</div>
	<div class="form-group">
		<label for="typeVehicule" class="col-sm-4 control-label">Type
			vehicule :</label>
		<div class="col-sm-4">
			<form:select path="typeVehicule" cssClass="form-control">
				<form:options items="${typeVehicules}" itemValue="id"
					itemLabel="libelle" />
			</form:select>
		</div>
	</div>
	<div class="form-group">
		<label for="owner" class="col-sm-4 control-label">Owner :</label>
		<div class="col-sm-4">
			<form:select path="owner" cssClass="form-control">
				<form:options items="${clients}" itemValue="id" itemLabel="nom" />
			</form:select>
		</div>
	</div>	
	<div class="form-group form-actions">
		<div class="col-sm-5"></div>
		<div class="col-sm-2">
			<input type="submit" value="Enregistrer"
				class="btn btn-lg btn-primary" />
		</div>
	</div>
</form:form>
<p></p>

