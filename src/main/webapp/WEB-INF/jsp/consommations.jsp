<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles-extras"
	prefix="tilesx"%>
<button type="button" class="btn btn-primary btn-lg" data-toggle="modal"
	data-target="#myModal">Ajouter consommation</button>
<!-- Modal -->
<form:form modelAttribute="consommation" cssClass="form-horizontal">
	<div class="modal fade" id="myModal" tabindex="-1" role="dialog"
		aria-labelledby="myModalLabel">
		<div class="modal-dialog" role="document">
			<div class="modal-content">
				<div class="modal-header">
					<button type="button" class="close" data-dismiss="modal"
						aria-label="Close">
						<span aria-hidden="true">&times;</span>
					</button>
					<h4 class="modal-title" id="myModalLabel">Nouvelle consommation</h4>
				</div>
				<div class="modal-body">
					<div class="form-group">
						<label for="name" class="col-sm-4 control-label">libelle :</label>
						<div class="col-sm-4">
							<form:input path="name" cssClass="form-control" />
						</div>
					</div>
					<div class="form-group">
						<label for="prixConso" class="col-sm-4 control-label">Prix unitaire :</label>
						<div class="col-sm-4">
							<form:input path="prixConso" cssClass="form-control" />
						</div>
					</div>
					<div class="form-group">
						<label for="typeConso" class="col-sm-4 control-label">Type Conso :</label>
						<div class="col-sm-4">
							<form:select path="typeConso" items="${typesConso}" itemValue="id" itemLabel="name" cssClass="form-control" />
						</div>
					</div>

					<div class="form-group">
						<label for="stockMini" class="col-sm-4 control-label">Stock mini :</label>
						<div class="col-sm-4">
							<form:input path="stockMini" cssClass="form-control" />
						</div>
					</div>					

					<div class="form-group">
						<label for="qteEnStock" class="col-sm-4 control-label">Quantite en stock :</label>
						<div class="col-sm-4">
							<form:input path="qteEnStock" cssClass="form-control" />
						</div>
					</div>
				</div>
				<div class="modal-footer">
					<button type="button" class="btn btn-default" data-dismiss="modal">Fermer</button>
					<input type="submit" class="btn btn-primary" value="Enregistrer" />
				</div>
			</div>
		</div>
	</div>
</form:form>
<table class="table table-condensed table-striped table-hover">
<thead>
	<tr>
		<th>Libelle</th>
		<th>Type Conso</th>
		<th>Prix unitaire </th>
		<th>Stock mini</th>
		<th>Quantite en stock</th>
	</tr>
	</thead>
	<tbody>
	<c:forEach items="${consommations}" var="consommation">
		<tr>
			<td>${consommation.name}</td>
			<td>${consommation.typeConso.name}</td>
			<td>${consommation.prixConso}</td>
			<td>${consommation.stockMini}</td>
			<td>${consommation.qteEnStock}</td>
		</tr>
	</c:forEach>
	</tbody>
</table>
