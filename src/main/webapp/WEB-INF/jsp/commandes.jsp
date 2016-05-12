<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles-extras"
	prefix="tilesx"%>

<button type="button" class="btn btn-primary btn-lg" data-toggle="modal"
	data-target="#myModal">Ajouter commande</button>

<!-- Modal -->
<form:form modelAttribute="commande" cssClass="form-horizontal">
	<div class="modal fade" id="myModal" tabindex="-1" role="dialog"
		aria-labelledby="myModalLabel">
		<div class="modal-dialog" role="document">
			<div class="modal-content">
				<div class="modal-header">
					<button type="button" class="close" data-dismiss="modal"
						aria-label="Close">
						<span aria-hidden="true">&times;</span>
					</button>
					<h4 class="modal-title" id="myModalLabel">Nouvelle commande</h4>
				</div>
				<div class="modal-body">
					<div class="form-group">
						<label for="nom" class="col-sm-2 control-label">Client:</label>
						<div class="col-sm-4">
							<form:select items="${clients}" itemLabel="nom" itemValue="id" path="client" cssClass="form-control" />
						</div>
					</div>
					<div class="form-group">
						<label for="date" class="col-sm-2 control-label">Date commande :</label>
						<div class="col-sm-4">
							<form:input path="dateCommande" cssClass="form-control" />
						</div>
					</div>
				</div>
				<div class="modal-footer">
					<button type="button" class="btn btn-default" data-dismiss="modal">Fermer</button>
					<input type="submit" class="btn btn-primary" value="Creer commande" />
				</div>
			</div>
		</div>
	</div>
</form:form>
<table class="table table-condensed table-striped table-hover">
	<thead>
		<tr>
			<th>N&deg; commande</th>
			<th>Date</th>
			<th>Client</th>
			<th>Total</th>
		</tr>
	</thead>
	<tbody>
		<c:forEach items="${commandes}" var="commande">
			<tr>
				<td>Commande ${commande.id}</td>
				<td>${commande.dateCommande}</td>
				<td>${commande.client.name}</td>
				<td>${commande.totalCommande}</td>
			</tr>
		</c:forEach>
	</tbody>
</table>