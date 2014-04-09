define([], function() {
    App.Model._FacturaModel = Backbone.Model.extend({
        defaults: {
 
		 'fecha' : ''
 ,  
		 'costoTotal' : ''
 ,  
		 'name' : ''
        },
        initialize: function() {
        },
        getDisplay: function(name) {
             if(name=='fecha'){
                   var dateConverter = App.Utils.Converter.date;
                   return dateConverter.unserialize(this.get('fecha'), this);
             }
         return this.get(name);
        }
    });

    App.Model._FacturaList = Backbone.Collection.extend({
        model: App.Model._FacturaModel,
        initialize: function() {
        }

    });
    return App.Model._FacturaModel;
});