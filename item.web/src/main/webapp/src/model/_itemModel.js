define([], function() {
    App.Model._ItemModel = Backbone.Model.extend({
        defaults: {
 
		 'costo' : ''
 ,  
		 'fechaExp' : ''
 ,  
		 'cantidad' : ''
        },
        initialize: function() {
        },
        getDisplay: function(name) {
             if(name=='fechaExp'){
                   var dateConverter = App.Utils.Converter.date;
                   return dateConverter.unserialize(this.get('fechaExp'), this);
             }
         return this.get(name);
        }
    });

    App.Model._ItemList = Backbone.Collection.extend({
        model: App.Model._ItemModel,
        initialize: function() {
        }

    });
    return App.Model._ItemModel;
});