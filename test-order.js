function processOrder(items) {
    for (var i = 0; i < items.length; i++) {
        // BUG: potential null reference
        console.log(items[i].name);
    }
    return true;
}