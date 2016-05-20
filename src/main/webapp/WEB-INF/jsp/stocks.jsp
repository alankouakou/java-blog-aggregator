<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles-extras"
	prefix="tilesx"%>

<!-- Histogramme 
<script src="https://code.highcharts.com/highcharts.js"></script>
<script src="https://code.highcharts.com/modules/data.js"></script>
<script src="https://code.highcharts.com/modules/exporting.js"></script>
-->
<script src="../../resources/js/highcharts.js"></script>
<script src="../../resources/js/modules/data.js"></script>
<script src="../../resources/js/modules/exporting.js"></script>


<div id="container"
	style="min-width: 310px; height: 400px; margin: 0 auto"></div>

<table id="stocks"
	class="table table-condensed table-striped table-hover">
	<thead>
		<tr>
			<th>Consommation</th>
			<th>Quantite en stock</th>
			<th>Stock mini</th>
		</tr>
	</thead>
	<tbody>
		<c:forEach items="${consommations}" var="consommation">
			<tr
				class="${consommation.qteEnStock <= consommation.stockMini?'danger' : ''}">
				<td>${consommation.name}</td>
				<td>${consommation.qteEnStock}</td>
				<td>${consommation.stockMini}</td>
			</tr>
		</c:forEach>
	</tbody>
</table>
<script>
$(function () {
	$('#stocks').hide();
    $('#container').highcharts({
        data: {
            table: 'stocks'
        },
        chart: {
            type: 'column'
        },
        title: {
            text: 'Consommations'
        },
        yAxis: {
            allowDecimals: false,
            title: {
                text: 'Unités'
            }
        },
        tooltip: {
            formatter: function () {
                return '<b>' + this.point.name + '</b><br/>' +
                this.series.name + ' : ' + this.point.y ;
            }
        }
    });
});
</script>