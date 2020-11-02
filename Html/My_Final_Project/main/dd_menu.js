    var items = [
    {
        name: '---',
        value:'',
        subitems: []
    },
    {
        name:'Fruit', 
        value: 'fruit', 
        subitems: [
            {name: 'Apple', value: 'apple'}, 
            {name:'Banana', value:'banana'}
        ]
    },
    {
        name: 'Vegetable',
        value: 'vegetable',
        subitems: [
            {name: 'Carrot', value:'carrot'},
            {name: 'Celery', value:'celery'}
        ]
    }
];


$(function(){
    var temp = {};

    $.each(items, function(){
        $("<option />")
        .attr("value", this.value)
        .html(this.name)
        .appendTo("#firstmenu");
        temp[this.value] = this.subitems;
    });

    $("#firstmenu").change(function(){
        var value = $(this).val();
        var menu = $("#secondmenu");

        menu.empty();
        $.each(temp[value], function(){
            $("<option />")
            .attr("value", this.value)
            .html(this.name)
            .appendTo(menu);
        });
    }).change();


});