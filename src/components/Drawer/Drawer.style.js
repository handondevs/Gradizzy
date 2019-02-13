const drawerWidth = 240;
const drawerHeight = 70;

const styles = theme => ({
  drawer: {
    width: drawerWidth,
  },
  drawerPaper: {
    width: drawerWidth,
  },
  drawerHeader: {
    minHeight: drawerHeight,
    display: 'flex',
    alignItems: 'center',
    padding: '0 8px',
    justifyContent: 'flex-end',
  },
});

export default styles;